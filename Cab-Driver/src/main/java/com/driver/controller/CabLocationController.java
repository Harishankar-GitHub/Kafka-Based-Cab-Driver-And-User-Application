package com.driver.controller;

import com.driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        // Random location details will be published to Kafka topic every 1 second till 100 seconds.
        int range = 100;
        while (range > 0) {
            cabLocationService.updateLocation("Driver location Details: " + Math.random() + " , " + Math.random());
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("Message", "Driver location details sent to Kafka topic."), HttpStatus.OK);
    }
}

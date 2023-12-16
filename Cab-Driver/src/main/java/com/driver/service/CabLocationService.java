package com.driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.driver.constant.AppConstants.CAB_LOCATION;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void updateLocation(String location) {
        kafkaTemplate.send(CAB_LOCATION, location);
    }
}

package com.user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    // This method listens to the specified Kafka topic and Group ID.
    @KafkaListener(topics="cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}

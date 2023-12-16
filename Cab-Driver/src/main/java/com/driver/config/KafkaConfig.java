package com.driver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.driver.constant.AppConstants.CAB_LOCATION;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(CAB_LOCATION)     // If the topic is not present, it will be created during the startup of the application.
                .build();
    }
}

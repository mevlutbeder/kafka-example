package com.mev.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author mevlutbeder
 * @created 05/01/2023 19:48
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic mevTopic() {
        return TopicBuilder.name("mevTopicBuilder").build();

    }
}

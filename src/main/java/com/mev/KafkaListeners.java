package com.mev;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author mevlutbeder
 * @created 09/01/2023 08:49
 */
@Component
public class KafkaListeners {

    @KafkaListener(topics = "mevTopicBuilder", groupId = "groupId")
    void listener(String data) {
        System.out.println("listener received: " + data + " ∆");
    }

}

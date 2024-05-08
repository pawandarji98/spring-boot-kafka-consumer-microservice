package com.pawan.kafkamicroservice2.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics =  "kafkaProducer" , groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received : " + data );
    }

}

package com.example.kafkaproducer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

//    @KafkaListener(topics = "kafkaProducer", groupId = "spring")
//    public void consumer(String message) {
//        System.out.println(String.format("Subscribed : %s", message));
//
//    }
}

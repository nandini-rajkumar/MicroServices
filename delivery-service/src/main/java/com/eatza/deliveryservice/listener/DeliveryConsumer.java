package com.eatza.deliveryservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DeliveryConsumer {

    @KafkaListener(topics = "item_ordered", groupId = "item_id")
    public void consume(String message) {
    	log.info("Detected Order id: {} . Delivery Arranged! ", message);
        System.out.println("Detected Order id:" + message+ ". Delivery Arranged! ");
    }

}

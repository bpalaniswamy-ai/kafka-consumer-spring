package com.example.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "topic-3", groupId = "listener-group-1", topicPartitions = {@TopicPartition(topic = "topic-3", partitions = {"0", "3"})})
    public void consume(String message){
        logger.info("Consumed message: {} through topic: {} ", "topic-3", message);
    }
}

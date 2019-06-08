package com.companyname.ApacheKafkaExample;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume2(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message2 -> %s", message));
    }
}
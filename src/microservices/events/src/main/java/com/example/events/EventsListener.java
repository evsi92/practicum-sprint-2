package com.example.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class EventsListener {

    private static final Logger logger = LoggerFactory.getLogger(EventsListener.class);

    @KafkaListener(topics = "movie-events", groupId = "event-service-group")
    public void listenMovieEvents(String message) {
        logger.info("Movie message received: {}", message);
    }

    @KafkaListener(topics = "user-events", groupId = "event-service-group")
    public void listenUserEvents(String message) {
        logger.info("User message received: {}", message);
    }

    @KafkaListener(topics = "payment-events", groupId = "event-service-group")
    public void listenPaymentEvents(String message) {
        logger.info("Payment message received: {}", message);
    }
}

package com.example.events;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class ActionController {

    private static final Logger logger = LoggerFactory.getLogger(ActionController.class);

    private static final Status SUCCESS = new Status("success");

    @Autowired
    private KafkaProducer<String, String> producer;

    @GetMapping("/health")
    public ResponseEntity<HealthStatus> healthCheck() {
        return ResponseEntity.ok(new HealthStatus(true));
    }

    @PostMapping("/movie")
    public ResponseEntity<Status> sendMovieEvent(@RequestBody Movie event) {
        String message = event.toString();
        producer.send(new ProducerRecord<>("movie-events", message));
        logger.info("Movie Event sent: {}", message);
        return ResponseEntity.status(201).body(SUCCESS);
    }

    @PostMapping("/payment")
    public ResponseEntity<Status> sendPaymentEvent(@RequestBody Payment event) {
        String message = event.toString();
        producer.send(new ProducerRecord<>("payment-events", message));
        logger.info("Payment Event sent: {}", message);
        return ResponseEntity.status(201).body(SUCCESS);
    }

    @PostMapping("/user")
    public ResponseEntity<Status> sendUserEvent(@RequestBody User event) {
        String message = event.toString();
        producer.send(new ProducerRecord<>("user-events", message));
        logger.info("User Event sent: {}", message);

        return ResponseEntity.status(201).body(SUCCESS);
    }
}

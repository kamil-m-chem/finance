package com.example.finance.infrastructure.messaging;

import com.example.finance.domain.model.Transaction;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaTransactionPublisher {
    private final KafkaTemplate<String, Transaction> kafkaTemplate;

    public KafkaTransactionPublisher(KafkaTemplate<String, Transaction> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishTransaction(Transaction transaction) {
        kafkaTemplate.send("transactions", transaction);
    }
}

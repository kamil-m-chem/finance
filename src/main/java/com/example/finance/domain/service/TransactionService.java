package com.example.finance.domain.service;

import com.example.finance.domain.model.Transaction;
import com.example.finance.domain.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction saveTransaction(Transaction transaction) {
        // Business logic
        return repository.save(transaction);
    }

    public List<Transaction> getTransactionsByUser(String userId) {
        return repository.findByUserId(userId);
    }

    public void deleteTransaction(String transactionId) {
        repository.deleteById(transactionId);
    }
}

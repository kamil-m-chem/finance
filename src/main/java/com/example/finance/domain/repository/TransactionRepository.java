package com.example.finance.domain.repository;

import com.example.finance.domain.model.Transaction;
import java.util.List;

public interface TransactionRepository {
    Transaction save(Transaction transaction);
    List<Transaction> findByUserId(String userId);
    void deleteById(String id);
}


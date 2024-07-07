package com.example.finance.infrastructure.database;

import com.example.finance.domain.model.Transaction;
import com.example.finance.domain.repository.TransactionRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoTransactionRepository extends MongoRepository<Transaction, String>, TransactionRepository {
    List<Transaction> findByUserId(String userId);
}

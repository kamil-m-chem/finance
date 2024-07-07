package com.example.finance.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Transaction {
    private String id;
    private String userId;
    private BigDecimal amount;
    private String description;
    private LocalDateTime timestamp;
    private TransactionType type;


}

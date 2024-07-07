package com.example.finance.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@Document
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private Set<String> roles;

}
package com.example.finance.infrastructure.database;

import com.example.finance.domain.model.User;
import com.example.finance.domain.repository.UserRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MongoUserRepository extends MongoRepository<User, String>, UserRepository {
    Optional<User> findByUsername(String username);
}

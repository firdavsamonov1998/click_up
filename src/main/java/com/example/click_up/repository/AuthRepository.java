package com.example.click_up.repository;

import com.example.click_up.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<UserEntity, String> {
    boolean existsByUsername(String username);
}
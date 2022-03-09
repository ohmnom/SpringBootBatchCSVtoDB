package com.practice.springbatchexample1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springbatchexample1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}

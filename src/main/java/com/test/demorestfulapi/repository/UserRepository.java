package com.test.demorestfulapi.repository;

import com.test.demorestfulapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

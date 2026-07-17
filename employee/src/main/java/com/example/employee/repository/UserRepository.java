package com.example.employee.repository;

import com.example.employee.empentity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  // This query method must match the "username" field name in the User entity
  Optional<User> findByUsername(String username);
//  Optional
}
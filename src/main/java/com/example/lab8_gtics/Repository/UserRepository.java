package com.example.lab8_gtics.Repository;

import com.example.lab8_gtics.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

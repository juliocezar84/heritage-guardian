package com.mackenzie.heritageguardian.repositories;

import com.mackenzie.heritageguardian.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

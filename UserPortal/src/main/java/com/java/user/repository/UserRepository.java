package com.java.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findById(Long id);

}

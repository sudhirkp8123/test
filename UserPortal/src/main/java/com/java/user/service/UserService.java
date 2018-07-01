package com.java.user.service;

import java.util.List;

import com.java.user.model.User;

public interface UserService {

	User getById(Long userId);
	List<User> findAllUsers();
	User createOrUpdateUser(User user);
	void deleteUser(Long id);
}

package com.java.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.java.user.model.User;
import com.java.user.repository.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User getById(Long userId) {
		Assert.notNull(userId, "User id should not be null");
		User user = userRepository.findOne(userId);
		return (user != null ? user : null);
	}

	public List<User> findAllUsers() {
		List<User> userList = null;
		userList = userRepository.findAll();
		return userList;
	}

	public User createOrUpdateUser(User user) {
		Assert.notNull(user, "User shoud not be null");
		user = userRepository.save(user);
		return user;
	}

	public void deleteUser(Long id) {
		Assert.notNull(id, "Id should not be null");
		Assert.isTrue(userRepository.exists(id), "User not found");
		userRepository.delete(id);
	}

}

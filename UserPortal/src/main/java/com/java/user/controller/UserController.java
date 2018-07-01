package com.java.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.user.conversion.EntityConversionService;
import com.java.user.model.User;
import com.java.user.proxy.UserProxy;
import com.java.user.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@CrossOrigin
@RestController
@RequestMapping(value="/user")
public class UserController {

	private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EntityConversionService entityConversionService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<UserProxy> findAllUsers() {
		List<UserProxy> userProxyList = null; 
		try{
			LOGGER.info("Controller - findAllUsers called");
			List<User> userList = userService.findAllUsers();
			LOGGER.info("Returning - findAllUsers method");
			
			if(!userList.isEmpty()){
				userProxyList = entityConversionService.convertList(userList);
			}
		} catch (Exception e){
			LOGGER.error("Error thrown while fecting all users, Error: "+e.getStackTrace());
		}
		return userProxyList;
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "callFindUserById_Fallback")
	public UserProxy findUserById(@PathVariable(value = "userId") Long userId){
		UserProxy proxy = null;
		try{		
			Assert.notNull(userId, "userId should not be null");
			User user = userService.getById(userId);
			if(user != null){
				proxy = entityConversionService.convert(user);
			}
		} catch (Exception e){
			LOGGER.error("Error thrown while fecting user of Id: "+userId+" Error: "+e.getStackTrace());
		}
		if(proxy != null){
			throw new RuntimeException();
		}
		return proxy;
	}
	@RequestMapping(value = "/createOrUpdate", method = RequestMethod.POST)
	public UserProxy createUserData(@RequestBody UserProxy proxy){
		try{
			Assert.notNull(proxy, "proxy should not be null");
			User user = entityConversionService.convert(proxy);
			user = userService.createOrUpdateUser(user);
			if(user != null && user.getId() != null){
				proxy = entityConversionService.convert(user);
			}
		} catch(Exception e){
			LOGGER.error("Error thrown while creating or updating user, Error: "+e.getStackTrace());
		}
		return proxy;
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	public void deleteUserById(@PathVariable(value = "userId") Long userId){
		try{
			Assert.notNull(userId, "userId should not be null");
			userService.deleteUser(userId);
		}catch(Exception e){
			LOGGER.error("Error thrown while deleting user for Id: "+userId+ "Error: "+e.getStackTrace());
		}
		
		}
	
	public UserProxy callFindUserById_Fallback(Long userId){
		UserProxy proxy = new UserProxy();
		proxy.setId(999L);
		proxy.setName("FallBackMethod Called");
		return proxy;
	}
	}

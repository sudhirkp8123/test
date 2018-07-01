package com.java.user.controller;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.java.user.conversion.EntityConversionService;
import com.java.user.model.User;
import com.java.user.proxy.UserProxy;
import com.java.user.service.UserService;
import com.user.UserPortal.UserPortalApplicationTests;

public class UserControllerTest extends UserPortalApplicationTests{
/*
	@Mock
	private UserService userService;
	
	@InjectMocks
	private UserController userController;
	
	@Mock
	@Autowired
	private EntityConversionService entityConversionService;
	
	private MockMvc mockMvc;
	
	private List<User> userList;
	private List<UserProxy> userProxyList;
	User user1, user2;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
		user1 = new User(1L, "Sudhir", "10th Jan 1989", "sk@gmail.com", "8123910850");
		user2 = new User(2L, "Praveen", "21th Jan 1989", "prv@gmail.com", "1234567819");
		userList = Arrays.asList(user1,user2);	
		userProxyList = entityConversionService.convertList(userList);
	}
	
	@Test
	public void testFindAllUsers() throws Exception{
		Mockito.when(entityConversionService.convertList(userList)).thenReturn(userProxyList);
		Mockito.when(userService.findAllUsers()).thenReturn(userList);
		mockMvc.perform(MockMvcRequestBuilders.get("/user/all").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$", hasSize(2))).andDo(print());
	}*/
}

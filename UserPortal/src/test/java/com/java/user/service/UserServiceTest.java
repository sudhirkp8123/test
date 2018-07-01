package com.java.user.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.java.user.model.User;
import com.java.user.repository.UserRepository;
import com.user.UserPortal.UserPortalApplicationTests;

public class UserServiceTest extends UserPortalApplicationTests {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userService;
	
	private List<User> userList;
	User user1, user2;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
		user1 = new User(1L, "Sudhir", "10th Jan 1989", "sk@gmail.com", "8123910850");
		user2 = new User(2L, "Praveen", "21th Jan 1989", "prv@gmail.com", "1234567819");
		userList = Arrays.asList(user1,user2);	
	}
	
	@Test
	public void testFindAllUsers(){
		Mockito.when(userRepository.findAll()).thenReturn(userList);
		List<User> testUserList = userService.findAllUsers();
		assertEquals(2, testUserList.size());
		assertEquals("Sudhir", testUserList.get(0).getName());
	}
	
	@Test
	public void testGetById(){
		Mockito.when(userRepository.findOne(1L)).thenReturn(user1);
		User testUser1 = userService.getById(1L);
		assertEquals("Sudhir", testUser1.getName());
		
		Mockito.when(userRepository.findOne(3L)).thenReturn(null);
		User testUser2 = userService.getById(3L);
		assertNull(testUser2);
	}
	
	@Test
	public void testCreateOrUpdateUser(){
		Mockito.when(userRepository.save(user2)).thenReturn(user2);
		User createUser = userService.createOrUpdateUser(user2);
		assertEquals("Praveen", createUser.getName());
	}
	
	/*public void testDeleteUser(){
		userService.deleteUser(2L);
		verify(userRepository, ((Object) times(1)).delete(2L));
	}*/
}

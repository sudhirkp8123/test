package com.java.user.conversion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.java.user.model.User;
import com.java.user.proxy.UserProxy;

@Component
public class EntityConversionService {
	
	@Autowired
	private EntityMapping mapping;
	

	public UserProxy convert(User enitity){
		UserProxy userProxy = mapping.getMapper().map(enitity, UserProxy.class);
		
		return userProxy != null ? userProxy : null;
		
	}
	
	public User convert(UserProxy userProxy){
		User entity = mapping.getMapper().map(userProxy, User.class);
		
		return entity != null ? entity : null;
		
	}
	public List<UserProxy> convertList(List<User> userList){
		List<UserProxy> userProxyList = null;
		userProxyList = mapping.getMapper().mapAsList(userList, UserProxy.class);
		Assert.notNull(userList, "User List should not be null");
		return userProxyList;
		
	}

	
}

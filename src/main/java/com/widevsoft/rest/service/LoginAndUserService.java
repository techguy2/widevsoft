package com.widevsoft.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widevsoft.rest.dao.UserRoleDaoImpl;

import com.widevsoft.rest.pojo.Role;
import com.widevsoft.rest.pojo.User;

@Service
public class LoginAndUserService {
	
	@Autowired
	private UserRoleDaoImpl userRoleDaoImpl;
	

	public User validateUserUsing(String username, String password) {
		
		User user = userRoleDaoImpl.findUserWithUsernameAndPassword(username, password);
		
		return user!= null?user:null;
	
	}
	
	public List<User> getAllUsersWithRoles(){ return null;}
	
	public List<Role> getOnlyRoleList(){return null;}
	
	public List<User> getOnlyUserList(){return null;}
	
	public void createUserWithRole() {}
	
	public void createRole() {}
	
	public void updateUserOnly() {}
	
	public void updateUserRole() {}
	
	public void deleteUser() {} 
	
	public void deleteRole() {}
	
}



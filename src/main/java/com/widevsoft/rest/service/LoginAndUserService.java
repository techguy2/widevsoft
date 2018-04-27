package com.widevsoft.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widevsoft.rest.dao.UserRoleDaoImpl;
import com.widevsoft.rest.pojo.Role;
import com.widevsoft.rest.pojo.User;
import com.widevsoft.rest.pojo.UserEager;

@Service
public class LoginAndUserService {
	
	@Autowired
	private UserRoleDaoImpl userRoleDaoImpl;
	

	
	
	public User validateUserUsing(String username, String password) {
		
		User user = userRoleDaoImpl.findUserWithUsernameAndPassword(username, password);
		
		return user!= null?user:null;
	
	}
	
	public List<UserEager> getAllUsersWithRoles(){ 
		
		List<UserEager> users = userRoleDaoImpl.findAllUsersWithRoles();
		return users!= null?users:null;
		
	}
	
	public List<Role> getOnlyRoleList(){
		
		List<Role> roles = userRoleDaoImpl.findOnlyRoles();
		return roles!= null?roles:null;
	
	}
	
	
	public List<User> getOnlyUserList(){
		
		List<User> users = userRoleDaoImpl.findOnlyUsers();
		return users!= null?users:null;
	
	}
	
	public List<UserEager> createUserWithRole(UserEager user) {
		
		List<UserEager> users = userRoleDaoImpl.addUserWithRole(user);
		return users!= null?users:null;
	}
	
	public List<Role> createRole(Role role) {
		List<Role> roles = userRoleDaoImpl.addRole(role);
		return roles!= null?roles:null;
	}
	
	public void updateUserOnly() {}
	
	public void updateUserRole() {}
	
	public void deleteUser() {} 
	
	public void deleteRole() {}
	
}



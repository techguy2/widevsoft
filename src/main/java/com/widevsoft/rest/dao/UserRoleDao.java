package com.widevsoft.rest.dao;

import java.util.List;

import com.widevsoft.rest.pojo.Role;
import com.widevsoft.rest.pojo.User;
import com.widevsoft.rest.pojo.UserEager;


public interface UserRoleDao {
	
	public User findUserWithUsernameAndPassword(String username, String password);
	
	public List<UserEager> addUserWithRole(UserEager user);
	
	public List<Role> addRole(Role role);
	
	public List<User> findOnlyUsers();
	
	public List<Role> findOnlyRoles();
	
	public List<UserEager> findAllUsersWithRoles();
	
	public boolean updateUserRoleById(User user);
	
	public boolean deleteUserById(User user);
	
	public boolean deleteRoleById(Role role);
	
}


package com.widevsoft.rest.dao;

import java.util.List;

import com.widevsoft.rest.pojo.Role;
import com.widevsoft.rest.pojo.User;

public interface UserRoleDao {
	
	public User findUserWithUsernameAndPassword(String username, String password);
	
	public User addUser(User user);
	
	public Role addRole(Role role);
	
	public List<User> findOnlyUsers();
	
	public List<Role> findOnlyRoles();
	
	public List<User> findAllUsersWithRoles();
	
	public boolean updateUserRoleById(User user);
	
	public boolean deleteUserById(User user);
	
}


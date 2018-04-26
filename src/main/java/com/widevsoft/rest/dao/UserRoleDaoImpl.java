package com.widevsoft.rest.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.widevsoft.rest.pojo.Role;
import com.widevsoft.rest.pojo.User;


@Repository
public class UserRoleDaoImpl implements UserRoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public User findUserWithUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Inside DAO ");
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findOnlyUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findOnlyRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsersWithRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUserRoleById(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserById(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRoleById(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

}

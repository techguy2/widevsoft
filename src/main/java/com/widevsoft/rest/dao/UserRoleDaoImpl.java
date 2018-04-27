package com.widevsoft.rest.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.widevsoft.rest.pojo.Role;
import com.widevsoft.rest.pojo.User;
import com.widevsoft.rest.pojo.UserEager;


@Repository
public class UserRoleDaoImpl implements UserRoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public User findUserWithUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		
		User user = null;
		try {
			Query query = session.createQuery("FROM User where username=? and password=?");
			query.setString(0, username);
			query.setString(1, password);
			user = (User) query.uniqueResult();
			return user;
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("Inside DAO ");
			session.close();
		}
		
		return user;
	}

	@Override
	public List<UserEager> addUserWithRole(UserEager user) {
		// Create session from Session Factory
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			List<UserEager> users = this.findAllUsersWithRoles();
			return users;
		}
		catch(Exception e) {
			session.getTransaction().rollback();
			return null;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<Role> addRole(Role role) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(role);
			session.getTransaction().commit();
			List<Role> roles = this.findOnlyRoles();
			return roles;
		}
		catch(Exception e) {
			session.getTransaction().rollback();
			return null;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<User> findOnlyUsers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List<User> users;
		try {
			Query query = session.createQuery("FROM User Where deleteFlag = ?");
			query.setInteger(0, 1);
			users = (List<User>) query.list();
			return users;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<Role> findOnlyRoles() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List<Role> roles;
		try {
			Query query = session.createQuery("FROM Role Where deleteFlag = ?");
			query.setInteger(0, 1);
			roles = (List<Role>) query.list();
			return roles;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<UserEager> findAllUsersWithRoles() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List<UserEager> users;
		try {
			Query query = session.createQuery("FROM User Where deleteFlag = ?");
			query.setInteger(0, 1);
			users = (List<UserEager>) query.list();			
			return users;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
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

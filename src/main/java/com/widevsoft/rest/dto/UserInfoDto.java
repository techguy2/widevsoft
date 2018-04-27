package com.widevsoft.rest.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class UserInfoDto {
	
	private int userId;
	
	private String username;
	
	private Date dob;
	
	private Date updatedOn;
	
	private Set<RoleInfoDto> roleInfo = new HashSet<RoleInfoDto>(3); 

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date lastUpdated) {
		this.updatedOn = lastUpdated;
	}

	public Set<RoleInfoDto> getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(Set<RoleInfoDto> roleInfo) {
		this.roleInfo = roleInfo;
	}
	
	

}

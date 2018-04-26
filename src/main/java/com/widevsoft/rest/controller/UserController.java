package com.widevsoft.rest.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.widevsoft.rest.dto.UserInfoDto;
import com.widevsoft.rest.dto.UserLoginDto;
import com.widevsoft.rest.pojo.User;
import com.widevsoft.rest.service.LoginAndUserService;

@RestController
public class UserController {
	
	@Autowired
	private LoginAndUserService loginService;
	
	@RequestMapping(value="/user", method= RequestMethod.POST)
	public UserInfoDto userlogin(@RequestBody UserLoginDto login) {
		
		User user = loginService.validateUserUsing(login.getUsername(), login.getPassword());
		UserInfoDto userInfo = new UserInfoDto();
		if(user == null) {
			
			return userInfo;
		}
		else {
			ModelMapper modelMapper = new ModelMapper();
			userInfo = modelMapper.map(user, UserInfoDto.class);
			return userInfo;
		}
		
	}
	
	@RequestMapping(value="/users/{id}", method= RequestMethod.GET)	
	public UserInfoDto userPackageInfo(@PathVariable("id") int userId){	
		System.out.println("Inside the method");
		UserInfoDto userInfo = new UserInfoDto();
		userInfo.setUserId(10);
		return userInfo;
	}
	
	
	
}

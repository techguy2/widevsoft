package com.widevsoft.rest.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value="/users/{id}", method= RequestMethod.POST)	
	public String userPackageInfo(@PathVariable("id") int userId){	
		return "Hello";
	}
}

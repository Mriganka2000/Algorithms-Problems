package com.androjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.androjava.models.UserData;
import com.androjava.services.UserDataImp;
import com.androjava.services.UserService;

@Controller
public class UserController 
{

@Autowired
UserService userService;
	
	
	
@RequestMapping(path = "/", method = RequestMethod.GET)	
public String home()
{
	return "index";	
}

@RequestMapping(path = "/register", method = RequestMethod.GET)	
public String register()
{
	return "register";	
}


@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
public String userRegister(@ModelAttribute UserData data)
{

	userService.adduser(data);
	return "myjsp";
}







	
	
	
}

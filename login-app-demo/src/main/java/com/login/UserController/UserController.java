package com.login.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.UserService.UserService;

@RestController
@CrossOrigin(origins="*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/create")
	public String createUserData(@RequestParam String username, String password) {
		
		userService.CreateUserLogin(username,password);
		
		return "successfully created the login data.......";
	}
	
	@RequestMapping("/login")
	public String checkLogin(@RequestParam String username, String password)
	{
		return userService.chechUserLogin(username,password);
	}
}

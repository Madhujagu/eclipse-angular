package com.sign.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sign.app.service.SignUpService;

@RestController
@CrossOrigin(origins="*")
public class SignUpController 
{
	@Autowired
	SignUpService signupServe;
	
	@RequestMapping("/signup")
	public String getSignUpUsers(@RequestParam String useremail, String phonenumber, String password)
	{
		signupServe.getSignUp(useremail,phonenumber,password);
		
		return "successfully added the data";
	}
	
	@RequestMapping("/signin")
	public String getSignInUser(@RequestParam String useremail, String phonenumber, String password) {
		return signupServe.getSignIn(useremail,phonenumber,password);
	}

}

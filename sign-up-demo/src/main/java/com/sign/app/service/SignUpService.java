package com.sign.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sign.app.model.Signup;
import com.sign.app.repo.SignUpRepo;

@Service
public class SignUpService 
{
	@Autowired
	SignUpRepo signupRepo;

	public void getSignUp(String useremail, String phonenumber, String password)
	{
		Signup allUsers=new Signup(useremail,phonenumber,password);
		
		signupRepo.save(allUsers);
		
	}

	public String getSignIn(String useremail, String phonenumber, String password) 
	{
		List<Signup> allSignUp=signupRepo.findAll();
		for(Signup allLogin:allSignUp)
		{
		if((allLogin.getUseremail().equalsIgnoreCase(useremail)||(allLogin.getPhonenumer().equalsIgnoreCase(phonenumber)))&&(allLogin.getPassword().equalsIgnoreCase(password)))
		{
			return "true";
		}
		}
		return "false";
	}

}

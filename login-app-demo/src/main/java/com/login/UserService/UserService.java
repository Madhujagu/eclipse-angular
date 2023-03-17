package com.login.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Model.User;
import com.login.UserRepository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	

	public void CreateUserLogin(String username, String password) {
		
		User allUser=new User(username,password);
		
		userRepo.save(allUser);
	}


	public String chechUserLogin(String username, String password) {
		List<User> allUsers=userRepo.findAll();
		for(User user:allUsers) {
			if((user.getUsername().equalsIgnoreCase(username))&&(user.getPassword().equalsIgnoreCase(password))) {
				return "true";
			}
		}
				
		return "false";
	}

}

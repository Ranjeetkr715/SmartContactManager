package com.smart.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.dao.UserRepo;
import com.smart.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private User user;
	
	private UserRepo userRepo;
	
	
	@RequestMapping("/index")
	public String dashboard(Model model,Principal principal) {
		String username = principal.getName();
		System.out.println("USERNAME " + username);
		User user = userRepo.getUserByUserName(username);
		
		// get the user using usernamne(Email)

//		User user = userRepo.getUserByUserName(userName);
//		
//		model.addAttribute("user", user);
	//getting 
		return "normal/user_dashboard";
	}

}

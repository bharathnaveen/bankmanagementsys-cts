package com.org.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.user.model.UserRegistration;


@RestController
public class UserRegistrationController {
	
	@RequestMapping("/user")
	public List<UserRegistration> getUserDetails () {
		
		List<UserRegistration> user = new ArrayList<>();
		UserRegistration user1 = new UserRegistration();
		user1.setFirstname("Ramesh");
		user1.setLastname("Tammineni");
		user1.setAddress("Visakhapatnam");
		user1.setEmail("ramesh@as.com");
		UserRegistration user2 = new UserRegistration();
		user2.setFirstname("Jyothsna");
		user2.setLastname("Seepana");
		user2.setAddress("Visakhapatnam");
		user2.setEmail("jyo@as.com");
		user.add(user1);
		user.add(user2);
		return user;
	}
}

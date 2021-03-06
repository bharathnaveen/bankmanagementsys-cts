package com.org.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.user.dto.UserDTO;
import com.org.user.service.UserService;



@RestController
@RequestMapping("user")
public class UserRegistrationController {
	
	@Autowired
	UserService userService;
	@PostMapping("/registration")
	public String saveUser(@RequestBody UserDTO userDTO) {
		userService.saveUser(userDTO);
		return "Successfully inserted";
	}
	
}

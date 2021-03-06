package com.org.user.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.user.dto.UserDTO;
import com.org.user.model.UserRegistration;
import com.org.user.repository.UserRepository;



@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired 
	UserRepository userRepository;
	
	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		UserRegistration userreg = new UserRegistration();
		userreg.setName(userDTO.getName());
		userreg.setUsername(userDTO.getUsername());
		userreg.setPassword(userDTO.getPassword());
		userreg.setGuardianname(userDTO.getGuardianname());
		userreg.setAddress(userDTO.getAddress());
		userreg.setEmail(userDTO.getEmail());
		userreg.setMaritalstatus(userDTO.getMaritalstatus());
		userreg.setContactno(userDTO.getContactno());
		userreg.setDob(userDTO.getDob());
		userreg.setAccttype(userDTO.getAccttype());
		userRepository.save(userreg);
		return userDTO;
	}
	
    
	
}

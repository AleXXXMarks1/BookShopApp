package com.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.models.User;
import com.qa.repositories.UserRepository;

@Service
public class UserService {
	
@Autowired 
private UserRepository userRepository;

	public User createUserRecord (User u)
{
	return userRepository.save(u);
}
	public User checkEmailandPassword(String email, String password)
	{
		return userRepository.verifyEmailandPassword(email, password);
	}
	
}

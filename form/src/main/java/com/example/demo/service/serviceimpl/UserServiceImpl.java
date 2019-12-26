package com.example.demo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userrepository;

	@Override
	public void save(User user) {
		
		userrepository.save(user);
	}

	@Override
	public List<User> getUser() {
		
		return userrepository.findAll();
		
	}

}

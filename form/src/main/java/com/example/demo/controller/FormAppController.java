package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import java.util.List;

@Controller
public class FormAppController {
	@Autowired
	UserService userservice;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	
	  @RequestMapping(value="/outputform",method=RequestMethod.POST) 
	  public String addUser(User user) {
		  
		  userservice.save(user);
		return null;
	  }
	  
	  @GetMapping(value="/getUser")
	  public  String getUser(Model model)
	  {
		  List<User> users=new ArrayList<User>();
		 users=userservice.getUser();
		 model.addAttribute("users",users);
		return "output";
		  
	  }
	 
	 

}

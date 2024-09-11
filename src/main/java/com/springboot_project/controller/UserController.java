package com.springboot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot_project.entity.UserData;
import com.springboot_project.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/register")
	public String home() {
		
		return "index";
		
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session) {
		
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully..");
		
		return "redirect:/";
	}
}

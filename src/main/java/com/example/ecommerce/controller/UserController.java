package com.example.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Doutor", "EMAIL", "32094824", "12345");
		return ResponseEntity.ok(u);
	}
	
}

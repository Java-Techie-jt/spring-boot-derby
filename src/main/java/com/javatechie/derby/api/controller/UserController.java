package com.javatechie.derby.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.derby.api.dao.UserRepository;
import com.javatechie.derby.api.model.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@PostMapping("/saveUsers")
	public String saveUser(@RequestBody List<User> users) {
		repository.saveAll(users);
		return users.size() + " record saved..";
	}

	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return (List<User>) repository.findAll();
	}

	@GetMapping("/getUserByName/{name}")
	public User findUserByName(@PathVariable String name) {
		return repository.findByName(name);
	}
}

package com.example.jobPlateForm.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobPlateForm.dto.UserDto;
import com.example.jobPlateForm.entity.User;
import com.example.jobPlateForm.service.UserService;

@RestController
@RequestMapping("user/")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("create")
	public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
		userService.createUser(userDto);
		return new ResponseEntity<String>("Thank You for Joining", HttpStatus.CREATED);

	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		return new ResponseEntity<String>("User are deleted sucessfully", HttpStatus.OK);

	}

	@PutMapping("update/{id}")
	public ResponseEntity<String> updateUser(@PathVariable int id, @RequestBody User user) {
		userService.updateUser(id, user);
		return new ResponseEntity<String>("User are updated sucessfully", HttpStatus.OK);

	}

	@GetMapping("user/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id) {
		return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
	}

	@GetMapping("users")
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<List<User>>(userService.getAllUser(), HttpStatus.OK);

	}

}

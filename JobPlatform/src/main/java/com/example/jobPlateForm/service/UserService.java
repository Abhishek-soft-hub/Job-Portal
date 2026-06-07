package com.example.jobPlateForm.service;

import java.util.List;

import com.example.jobPlateForm.entity.User;

public interface UserService {

	public void createUser(User user);
	public void deleteUser(int id);
	public void updateUser(int id, User user);
	public User getUser(int id);
	public List<User> getAllUser();
	
}

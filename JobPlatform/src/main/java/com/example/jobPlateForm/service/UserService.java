package com.example.jobPlateForm.service;

import java.util.List;

import com.example.jobPlateForm.dto.UserDto;
import com.example.jobPlateForm.entity.User;

public interface UserService {

	public void createUser(UserDto userDto);
	public void deleteUser(int id);
	public void updateUser(int id, UserDto userDto);
	public void UpdateCredential(int id, User user);
	public User getUser(int id);
	public List<User> getAllUser();
	
}

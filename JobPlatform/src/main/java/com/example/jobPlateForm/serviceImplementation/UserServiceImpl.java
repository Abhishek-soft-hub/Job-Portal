package com.example.jobPlateForm.serviceImplementation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.jobPlateForm.dto.UserDto;
import com.example.jobPlateForm.entity.User;
import com.example.jobPlateForm.exception.UserServiceException;
import com.example.jobPlateForm.repository.UserRepository;
import com.example.jobPlateForm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void createUser(UserDto userDto) {
		if (userRepository.existsByEmail(userDto.getEmail())
				|| userRepository.existsByMobileNumber(userDto.getMobileNumber())) {
			throw new UserServiceException("User Alredy Register", HttpStatus.FOUND);
		}
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setPassword(userDto.getPassword());
		user.setRole(userDto.getRole());

		userRepository.save(user);

	}

	@Override
	public void deleteUser(int id) {
		if (!userRepository.existsById(id)) {
			throw new UserServiceException("User is not found", HttpStatus.NOT_FOUND);
		}
		userRepository.deleteById(id);

	}

	@Override
	public void updateUser(int id, User user) {
		
		User existUser = userRepository.findById(id).orElseThrow(() -> new UserServiceException("User is not found", HttpStatus.NOT_FOUND));
		existUser.setEmail(user.getEmail());
		existUser.setMobileNumber(user.getMobileNumber());
		existUser.setPassword(user.getPassword());
		existUser.setRole(user.getRole());
		
		userRepository.save(existUser);
	}

	@Override
	public User getUser(int id) {
		if (!userRepository.existsById(id)) {
			throw new UserServiceException("User is not found", HttpStatus.NOT_FOUND);
		}
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		if (userRepository.findAll().isEmpty()) {
			throw new UserServiceException("Users is not found", HttpStatus.NOT_FOUND);
		}
		return userRepository.findAll();
	}

}

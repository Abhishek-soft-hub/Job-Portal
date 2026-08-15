package com.example.jobPlateForm.dto;

import com.example.jobPlateForm.enums.Role;

import lombok.Data;

@Data
public class UserDto {
	
	private String email;
	private long mobileNumber;
	private String password;
	private Role role;
	
	
	

}

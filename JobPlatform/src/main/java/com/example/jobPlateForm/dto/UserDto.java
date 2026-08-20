package com.example.jobPlateForm.dto;

import java.util.List;

import com.example.jobPlateForm.entity.Address;
import com.example.jobPlateForm.enums.Role;

import lombok.Data;

@Data
public class UserDto {
	private String email;
	private String password;
	private Long mobileNumber;
	private int experiance;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private List<String> skills;
	private List<Address> address;
	private Role role;
	

}

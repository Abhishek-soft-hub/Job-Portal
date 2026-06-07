package com.example.jobPlateForm.dto;

import lombok.Data;

import java.util.List;



@Data
public class ProfileUserDTO {

	private int id;

	private String firstName;
	private String middleName;
	private String lastName;

	private int experience;

	private List<String> skills;

	private int userId;

}
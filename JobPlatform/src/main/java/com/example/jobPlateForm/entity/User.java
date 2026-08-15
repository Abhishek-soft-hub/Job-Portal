package com.example.jobPlateForm.entity;

import com.example.jobPlateForm.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(unique = true, nullable = false)
	private String email;
	private long mobileNumber;
	@Column(nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;


}

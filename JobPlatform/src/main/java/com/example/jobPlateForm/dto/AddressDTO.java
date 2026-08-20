package com.example.jobPlateForm.dto;

import lombok.Data;

@Data
public class AddressDTO {

	private String country;
	private String state;
	private String city;
	private String area;
	private int pincode;
	private int profileId;
}

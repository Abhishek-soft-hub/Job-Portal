package com.example.jobPlateForm.service;

import java.util.List;

import com.example.jobPlateForm.entity.Address;

public interface AddressService {

	public void createAddress(Address address);
	public void deleteAddress(int id);
	public void updateAddress(int id, Address address);
	public List<Address> getAllAddress();
	
}

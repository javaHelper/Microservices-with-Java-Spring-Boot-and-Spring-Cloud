package com.example.addressservice.service;

import com.example.addressservice.dto.AddressResponse;
import com.example.addressservice.dto.CreateAddressRequest;

public interface AddressService {
	public AddressResponse createAddress(CreateAddressRequest createAddressRequest);
	public AddressResponse getById (long id);
}

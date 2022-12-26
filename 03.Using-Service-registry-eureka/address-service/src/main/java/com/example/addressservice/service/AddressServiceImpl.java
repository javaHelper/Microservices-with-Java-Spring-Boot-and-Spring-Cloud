package com.example.addressservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressservice.dto.AddressResponse;
import com.example.addressservice.dto.CreateAddressRequest;
import com.example.addressservice.entity.Address;
import com.example.addressservice.repository.AddressRepository;


@Service
public class AddressServiceImpl implements AddressService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	private AddressRepository addressRepository;


	@Override
	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		Address address = new Address();
		address.setStreet(createAddressRequest.getStreet());
		address.setCity(createAddressRequest.getCity());

		addressRepository.save(address);

		return new AddressResponse(address);
	}

	@Override
	public AddressResponse getById(long id) {
		LOGGER.info("Inside getById " + id);

		Address address = addressRepository.findById(id).get();

		return new AddressResponse(address);
	}

}

package com.example.demo.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.AddressResponse;


// Below can be used when you're not using Eureka-server
@FeignClient(url = "${address.service.url}", 
			value = "address-feign-client",
			path = "/api/address")
public interface AddressFeignClient {

	@GetMapping("/getById/{id}")
	public AddressResponse getById(@PathVariable long id);
}

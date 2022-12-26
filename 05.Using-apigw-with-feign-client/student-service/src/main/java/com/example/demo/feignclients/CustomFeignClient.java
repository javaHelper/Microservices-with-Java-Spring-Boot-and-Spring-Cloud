package com.example.demo.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.AddressResponse;

@FeignClient(value = "api-gateway")
public interface CustomFeignClient {

	@GetMapping("/address-service/api/address/getById/{id}")
	public AddressResponse getById(@PathVariable long id);
}

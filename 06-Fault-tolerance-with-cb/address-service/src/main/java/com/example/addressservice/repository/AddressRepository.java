package com.example.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressservice.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}

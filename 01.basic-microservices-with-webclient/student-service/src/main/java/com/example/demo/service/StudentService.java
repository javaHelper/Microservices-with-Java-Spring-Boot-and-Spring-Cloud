package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dto.AddressResponse;
import com.example.demo.dto.CreateStudentRequest;
import com.example.demo.dto.StudentResponse;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import reactor.core.publisher.Mono;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private WebClient webClient;

	
	public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());

		student.setAddressId(createStudentRequest.getAddressId());
		student = studentRepository.save(student);

		StudentResponse studentResponse = new StudentResponse(student);

		studentResponse.setAddressResponse(getAddressById(student.getAddressId()));

		return studentResponse;
	}

	public StudentResponse getById(long id) {
		Student student = studentRepository.findById(id).get();
		StudentResponse studentResponse = new StudentResponse(student);

		studentResponse.setAddressResponse(getAddressById(student.getAddressId()));

		return studentResponse;
	}

	public AddressResponse getAddressById(long addressId) {
		Mono<AddressResponse> addressResponse = webClient.get()
				.uri("/getById/" + addressId)
				.retrieve()
				.bodyToMono(AddressResponse.class);

		return addressResponse.block();
	}
}
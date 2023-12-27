package com.example.studentapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapi.service.AddressAPICall;
import com.example.studentapi.service.CourseAPICall;

@RestController
public class StudentController {
	
	@Autowired
	private AddressAPICall addressApiCall;
	
	@Autowired
	private CourseAPICall courseApiCall;
	
	@GetMapping("/name")
    public String getName(){
		String name="Rashmikanta";
		
		//get address detail
		String address= addressApiCall.getAddress();
		
		//get course detail
		String course = courseApiCall.getCourse();
        return "name= "+name+" address= "+address+" course= "+course;
    }
}

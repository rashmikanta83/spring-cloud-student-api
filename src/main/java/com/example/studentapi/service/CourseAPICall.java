package com.example.studentapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(url="http://localhost:8083", value="COURSE-API")
@FeignClient(name="COURSE-API")
public interface CourseAPICall {
	@GetMapping("/course")
    public String getCourse();
}

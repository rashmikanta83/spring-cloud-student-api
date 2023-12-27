package com.example.studentapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(url="http://localhost:8084", value="ADDRESS-SERVICE")
@FeignClient(name="ADDRESS-API")
public interface AddressAPICall {
	@GetMapping("/address")
    public String getAddress();
}

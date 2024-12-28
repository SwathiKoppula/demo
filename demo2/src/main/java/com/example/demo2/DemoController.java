package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoservice;

	@PostMapping("/saveData")
	public String addData(@RequestBody Demo demo) {
		 String result= demoservice.UserData(demo);
		return result;
	}
	
	@GetMapping("/users/{userId}")
	public Demo getFETUserData(@PathVariable("userId") int userId) {
		return demoservice.getUser(userId);
	}

}



package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@Autowired
	DemoRepository demorepository;

	public String UserData(Demo demo) {
		
		demorepository.save(demo);
		return "user saved";
		
	}

	public Demo getUser(int userId) {
		// TODO Auto-generated method stub
		Demo demo = demorepository.findById(userId).get();
		return demo;
	}
}


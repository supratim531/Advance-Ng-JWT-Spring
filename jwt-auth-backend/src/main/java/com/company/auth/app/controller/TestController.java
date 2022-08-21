package com.company.auth.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

	@GetMapping("/")
	public String test() {
		return "<h1>Backend (JWT) Server is Running Successfully</h1>";
	}

}

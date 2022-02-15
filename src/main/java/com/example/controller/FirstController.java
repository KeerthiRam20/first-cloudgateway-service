package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello World Called in first Service";
	}
}
//@RestController
//@RequestMapping("/order")
//public class FirstController { {
//
//	public String test() {
//		return "Hello World Called in third Service";
//	}
//}

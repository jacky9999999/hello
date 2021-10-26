package com.demo.demoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello, This is Jacky test app";
	}
}

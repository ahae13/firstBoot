package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping("/")
	public @ResponseBody String root() {
		return "hello";
	}
	
	@GetMapping("/index")
	public void index() {
		
	}
	
	@GetMapping("/list")
	public void list() {
		
	}
}
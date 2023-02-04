package com.example.eval;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/")
@Log4j2
public class MyController {
	
	@GetMapping("/index")
	public void index() {
		log.info("index.............");
		
	}
	
	@GetMapping("/sample/ex01")
	public void ex01() {
		log.info("ex01...........");
	}
}

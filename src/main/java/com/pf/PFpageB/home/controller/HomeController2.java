package com.pf.PFpageB.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/vueSpringTest")
public class HomeController2 {
 
	@GetMapping("/test2")
	public String index1() {
		return "hello456456";
	}
	@GetMapping("/")
	public String index2() {
		return "hello2";
	}
	@PostMapping("/test3")
	public String index3() {
		return "hello3";
	}
}
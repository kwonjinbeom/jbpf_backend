package com.pf.PFpageB.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class HomeController {
 
	@GetMapping("/test1")
	public String index1() {
		return "index.html";
	}
	@GetMapping("/")
	public String index2() {
		return "hello123132";
	}
}
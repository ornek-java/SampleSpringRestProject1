package com.ndr.sample.spring.rest.service;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SampleController1")
public class SampleController1 {
	
	@PostConstruct
	public void init() {
		System.out.println(this + ".init:" );
	}
	
	@RequestMapping("/test1")
	public String test1(){
		return "Test1!";
	}

}

package com.ndr.sample.spring.rest.service;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ndr.sample.spring.rest.model.SampleRequest;
import com.ndr.sample.spring.rest.model.SampleResult;

@RestController
public class SampleController2 {

	@PostConstruct
	public void init() {
		System.out.println(this + ".init:" );
	}
	
	@RequestMapping("/sampleMethod1")
	public SampleResult sampleMethod1(@RequestBody SampleRequest request){
		SampleResult sampleResult = new SampleResult();
		sampleResult.setSampleProperty1("Echo: " + request.getSampleProperty1());
		return sampleResult;
		
	}
	
}

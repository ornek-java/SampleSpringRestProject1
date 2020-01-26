package com.ndr.sample.spring.rest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages={"com.ndr.sample"})
public class SampleSpringRestServerApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SampleSpringRestServerApplication.class, args);
	}
	
	
}

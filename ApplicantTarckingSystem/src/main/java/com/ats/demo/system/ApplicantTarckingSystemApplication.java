package com.ats.demo.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan({"com.ats.demo.system.controller","com.ats.demo.system.repository","com.ats.demo.system.service","com.ats.demo.sytem.model"})
public class ApplicantTarckingSystemApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		SpringApplication.run(ApplicantTarckingSystemApplication.class, args);
	}

}

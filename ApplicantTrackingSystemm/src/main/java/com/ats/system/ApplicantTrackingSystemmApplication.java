package com.ats.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ats.system","application.properties"})
public class ApplicantTrackingSystemmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicantTrackingSystemmApplication.class, args);
	}

}

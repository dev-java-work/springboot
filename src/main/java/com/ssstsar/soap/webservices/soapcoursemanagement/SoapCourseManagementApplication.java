package com.ssstsar.soap.webservices.soapcoursemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SoapCourseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapCourseManagementApplication.class, args);
	}
}
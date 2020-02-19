package com.estudio.easyParking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EasyParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyParkingApplication.class, args);
	} 

}

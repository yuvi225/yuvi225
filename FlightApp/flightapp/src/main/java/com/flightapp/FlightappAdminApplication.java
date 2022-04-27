package com.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FlightappAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightappAdminApplication.class, args);
	}

}

package com.simonecampisi.TestEndpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TestEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEndpointApplication.class, args);
	}

}

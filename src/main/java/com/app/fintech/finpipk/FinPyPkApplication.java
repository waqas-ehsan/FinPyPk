package com.app.fintech.finpipk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FinPyPkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinPyPkApplication.class, args);
	}

}

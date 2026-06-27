package com.victordev.jobhunterbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobhunterbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobhunterbotApplication.class, args);
	}

}

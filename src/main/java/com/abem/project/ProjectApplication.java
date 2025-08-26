package com.abem.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("dbpassword", dotenv.get("dbpassword"));
		System.setProperty("dbusername", dotenv.get("dbusername"));
		System.setProperty("dburl", dotenv.get("dburl"));

		SpringApplication.run(ProjectApplication.class, args);
	}

}

package com.adin.restfulwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulwebserviceApplication {
	// http://localhost:8080/greeting?name=Adin - Output: Hello $name
	// http://localhost:8080/greeting - Output: Hello World (default value)
	public static void main(String[] args) {
		SpringApplication.run(RestfulwebserviceApplication.class, args);
	}

}

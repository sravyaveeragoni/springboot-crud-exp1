package com.example.springbootcrudexp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springbootcrudexp1.*")
public class SpringbootCrudExp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudExp1Application.class, args);
	}

}

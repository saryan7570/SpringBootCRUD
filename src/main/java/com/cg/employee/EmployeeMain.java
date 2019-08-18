package com.cg.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.employee")
public class EmployeeMain {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMain.class, args);
	}

}

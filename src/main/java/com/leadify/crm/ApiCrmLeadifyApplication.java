package com.leadify.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.leadify.crm.entity")
public class ApiCrmLeadifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCrmLeadifyApplication.class, args);
	}

}

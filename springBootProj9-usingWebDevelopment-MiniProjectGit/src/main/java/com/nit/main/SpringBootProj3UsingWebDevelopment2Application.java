package com.nit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication(scanBasePackages = "com.nit")
@EnableJpaRepositories(basePackages = "com.nit.repositories")
public class SpringBootProj3UsingWebDevelopment2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj3UsingWebDevelopment2Application.class, args);
	}

}

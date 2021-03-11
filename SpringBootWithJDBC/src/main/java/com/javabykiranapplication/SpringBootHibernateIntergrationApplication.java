package com.javabykiranapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringBootHibernateIntergrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateIntergrationApplication.class, args);
	}

	
}

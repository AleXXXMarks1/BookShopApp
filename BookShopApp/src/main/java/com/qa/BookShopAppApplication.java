package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.qa.services","com.qa.models","com.qa.repositories","com.qa.controllers"})
@EntityScan("com.qa.models")
public class BookShopAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookShopAppApplication.class, args);
	}
}

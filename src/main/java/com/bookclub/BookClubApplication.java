package com.bookclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BookClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookClubApplication.class, args);
	}

}

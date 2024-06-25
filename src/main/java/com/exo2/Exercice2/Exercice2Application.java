package com.exo2.Exercice2;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCaching
public class Exercice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercice2Application.class, args);
	}

}

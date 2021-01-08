package com.esprit.microservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
@EnableEurekaClient
public class LivraisonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivraisonApplication.class, args);
	}
	@Autowired
	private LivraisonRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save			
			Date date=new Date();
			
			repository.save(new Livraison(date,"Mariem",null,23161536,0));
			repository.save(new Livraison(date,"Sarra",null,23161536,0));
			repository.save(new Livraison(date,"Mohamed",null,23161536,0));
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}
}

package com.example.Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PackApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PackApplication.class, args);
		
		Alien a =context.getBean(Alien.class);
	
		
		
	}

}

package com.edu.eci.arsw.ARSWParcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.edu.eci.arsw.ARSWParcial"})
public class ArswParcialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArswParcialApplication.class, args);
	}

}

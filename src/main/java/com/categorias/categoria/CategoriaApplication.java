package com.categorias.categoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.categorias.categoria.entities"})
@ComponentScan(basePackages = "com.categorias.categoria,com.categorias.categoria.entities,com.categorias.categoria.repositories,com.categorias.categoria.controller")


public class CategoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriaApplication.class, args);
	}

}

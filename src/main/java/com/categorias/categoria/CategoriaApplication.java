package com.categorias.categoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.categorias.categoria.entities"})
@ComponentScan(basePackages = "com.categorias.categoria,com.categorias.categoria.entities,com.categorias.categoria.repositories,com.categorias.categoria.controller")
@EnableJpaRepositories

public class CategoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriaApplication.class, args);
	}

}

package com.categorias.categoria.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DefaultController {

	@RequestMapping(path="",method = RequestMethod.GET)
    public @ResponseBody String defaultMessage () {
		return "<h1>Servidor corriendo</h1><p>La aplicacion esta arriba</p>";
	}
	
}


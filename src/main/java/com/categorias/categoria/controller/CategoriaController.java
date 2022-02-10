package com.categorias.categoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.categorias.categoria.entities.Categoria;
import com.categorias.categoria.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin

public class CategoriaController {

	@Autowired
	private CategoriaRepository CategoriaRepositoryDAO;
	
	@RequestMapping(path= "/get-all", method = RequestMethod.GET)
	public @ResponseBody List<Categoria> getAllCategoria(){
	return CategoriaRepositoryDAO.findAll();
	}
	
	
	
	

}

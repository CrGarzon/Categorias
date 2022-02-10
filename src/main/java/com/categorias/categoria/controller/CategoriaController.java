package com.categorias.categoria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public @ResponseBody String saveCategoria (@RequestBody Categoria categoria) {
		CategoriaRepositoryDAO.save(categoria);
		return "Category save";
	}
	
	@RequestMapping (path = "/update", method = RequestMethod.PUT)
	public @ResponseBody Optional <Categoria> update(@RequestBody Categoria categoria){
		Optional <Categoria> optCategoria = CategoriaRepositoryDAO.findById(categoria.getId());
		CategoriaRepositoryDAO.save(categoria);
		return optCategoria;
	}
	
	@RequestMapping (path = "/delete", method = RequestMethod.DELETE)
	public @ResponseBody String delete(@RequestParam long id) {
		CategoriaRepositoryDAO.deleteById(id);
		return "Categoria deleted";
	}

}

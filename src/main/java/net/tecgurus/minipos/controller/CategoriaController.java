package net.tecgurus.minipos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.tecgurus.minipos.model.Categoria;
import net.tecgurus.minipos.service.CategoriaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("categoria")
@Api
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@PostMapping
	@ApiOperation(value = "Agrega una categoria al catalogo", response = Categoria.class)
	public Categoria insertar(@RequestBody Categoria categoria) {
		return categoriaService.guardar(categoria);
	}
	
	@GetMapping
	@ApiOperation(value = "Consulta todas las categorias", response = List.class)
	public List<Categoria> listar() {
		return categoriaService.listar();
	}
}

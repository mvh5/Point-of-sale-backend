package net.tecgurus.minipos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import net.tecgurus.minipos.model.Producto;
import net.tecgurus.minipos.service.ProductoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("producto")
@Api
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping
	@ApiOperation(value = "Agrega un producto", response = Producto.class)
	public Producto insertar(@RequestBody Producto producto) {
		return productoService.guardar(producto);
	}
	
	@GetMapping
	public List<Producto> listar() {
		return productoService.listar();
	}
	
	@GetMapping("busqueda/{filtro}")
	public List<Producto> buscar(@PathVariable("filtro") String filtro) {
		return productoService.buscar(filtro);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable("id") int idProducto) {
		return productoService.eliminar(idProducto);
	}
	
	@PutMapping
	public Producto actualizar(@RequestBody Producto producto) {
		return productoService.guardar(producto);
	}

}

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

import net.tecgurus.minipos.model.Cliente;
import net.tecgurus.minipos.service.ClienteService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("cliente")
@Api
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	@ApiOperation(value = "Agrega un cliente", response = Cliente.class)
	public Cliente insertar(@RequestBody Cliente cliente) {
		return clienteService.guardar(cliente);
	}
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteService.listar();
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable("id") int idCliente) {
		return clienteService.eliminar(idCliente);
	}
	
	@PutMapping
	public Cliente actualizar(@RequestBody Cliente cliente) {
		return clienteService.guardar(cliente);
	}

}

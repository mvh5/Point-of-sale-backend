package net.tecgurus.minipos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.minipos.converter.CompraDTOConverter;
import net.tecgurus.minipos.dto.CompraDTO;
import net.tecgurus.minipos.dto.InventarioDTO;
import net.tecgurus.minipos.model.Compra;
import net.tecgurus.minipos.service.CompraService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@Autowired
	private CompraDTOConverter compraDTOConverter;
	
	@GetMapping
	public List<Compra> listar() {
		return compraService.listar();
	}
	
	@GetMapping("/resumen")
	public List<CompraDTO> listarDTO() {
		return compraDTOConverter.convertir(compraService.listar());
	}
	
	@PostMapping
	public Compra insertar(@RequestBody Compra compra) {
		return compraService.guardar(compra);
	}
	
	@GetMapping("/inventario")
	public List<InventarioDTO> consultarInventario() {
		return compraService.consultarInventario();
	}

}

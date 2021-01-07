package net.tecgurus.minipos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.minipos.dto.InventarioDTO;
import net.tecgurus.minipos.exception.StockNoDisponibleException;
import net.tecgurus.minipos.model.Compra;
import net.tecgurus.minipos.model.Compraproducto;
import net.tecgurus.minipos.model.Producto;
import net.tecgurus.minipos.repository.CompraProductoRepository;
import net.tecgurus.minipos.repository.CompraRepository;
import net.tecgurus.minipos.repository.InventarioRepository;
import net.tecgurus.minipos.repository.ProductoRepository;

@Service
public class CompraService {
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Autowired
	private CompraProductoRepository compraProductoRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private InventarioRepository inventarioRepository;
	
	//validar que al comprar los productos se garantice que haya 10 de remanente
	//si no hay, regresar una exception StockNoDisponibleException(CONFLICT)
	
	@Transactional
	public Compra guardar(Compra compra) {
		for (Compraproducto compraProducto : compra.getCompraproductos()) {
			Producto producto = productoRepository.findById(compraProducto.getProducto().getIdproducto()).get();
			int stock = producto.getStock();
			if (stock - compraProducto.getCantidad() < 10) {
				throw new StockNoDisponibleException("No suficiente stock para "+producto.getNombre());
			}
		}
		
		Compra compraActualizada = compraRepository.save(compra);
		
		for (Compraproducto compraProducto : compra.getCompraproductos()) {
			compraProducto.setCompra(compraActualizada);
			Producto producto = productoRepository.findById(compraProducto.getProducto().getIdproducto()).get();
			
			int stock = producto.getStock();
			producto.setStock(stock - compraProducto.getCantidad());
			productoRepository.save(producto);
			
			compraProductoRepository.save(compraProducto);
		}
		
		
		
		return compraActualizada;
	}
	
	@Transactional
	public List<InventarioDTO> consultarInventario() {
		return inventarioRepository.consultarInventario();
	}
	
	@Transactional(readOnly = true)
	public List<Compra> listar() {
		return compraRepository.findAll();
	}

}

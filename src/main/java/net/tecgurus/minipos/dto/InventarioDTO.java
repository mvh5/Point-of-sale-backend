package net.tecgurus.minipos.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;

@NamedStoredProcedureQuery(
		name="consulta_inventario_mvh",
		procedureName = "consulta_inventario_mvh",
		resultClasses = InventarioDTO.class
		)
@Entity
public class InventarioDTO {
	
	@Id
	private int idproducto;
	
	private String nombre;
	
	private double ventastotales;
	
	private int cantidadvendidos;
	
	private int stock;

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVentastotales() {
		return ventastotales;
	}

	public void setVentastotales(double ventastotales) {
		this.ventastotales = ventastotales;
	}

	public int getCantidadvendidos() {
		return cantidadvendidos;
	}

	public void setCantidadvendidos(int cantidadvendidos) {
		this.cantidadvendidos = cantidadvendidos;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}

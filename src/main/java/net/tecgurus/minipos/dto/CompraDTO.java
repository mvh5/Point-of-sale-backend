package net.tecgurus.minipos.dto;

import java.util.Date;

public class CompraDTO {
	
	private int idcompra;
	private String nombreCliente;
	private String nombreVendedor;
	private Date fecha;
	private double total;
	
	
	
	public CompraDTO(int idcompra, String nombreCliente, String nombreVendedor, Date fecha, double total) {
		super();
		this.idcompra = idcompra;
		this.nombreCliente = nombreCliente;
		this.nombreVendedor = nombreVendedor;
		this.fecha = fecha;
		this.total = total;
	}
	
	public int getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}

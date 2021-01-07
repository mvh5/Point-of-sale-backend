package net.tecgurus.minipos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class StockNoDisponibleException extends RuntimeException {
	
	public StockNoDisponibleException(String mensaje) {
		super(mensaje);
	}
}

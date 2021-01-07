package net.tecgurus.minipos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ProductoNoEncontradoException extends RuntimeException {
	
	public ProductoNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}

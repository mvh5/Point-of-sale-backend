package net.tecgurus.minipos.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.tecgurus.minipos.dto.CompraDTO;
import net.tecgurus.minipos.model.Compra;

@Component
public class CompraDTOConverter {
	
	public static List<CompraDTO> convertir(List<Compra> compras) {
		List<CompraDTO> comprasDTO = new ArrayList<CompraDTO>();
		for (Compra compra : compras) {
			String cliente = compra.getCliente().getNombre() + " " + compra.getCliente().getApaterno();
			String vendedor = compra.getUsuario().getNombre();
			CompraDTO compraDTO = new CompraDTO(compra.getIdcompra(), cliente,vendedor,
					compra.getFecha(),compra.getTotal().doubleValue());
			comprasDTO.add(compraDTO);
		}
		return comprasDTO;
	}
}

package net.tecgurus.minipos.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.tecgurus.minipos.model.Cliente;

@SpringBootTest
public class ClienteRepositoryTest {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Test
	void testFindAll() {
		List<Cliente> clientes = clienteRepository.findAll();
		clientes.forEach(c -> {System.out.println(c.getNombre());});
	}

}

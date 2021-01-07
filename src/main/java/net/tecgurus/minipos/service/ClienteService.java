package net.tecgurus.minipos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import net.tecgurus.minipos.model.Cliente;
import net.tecgurus.minipos.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente guardar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Transactional(readOnly = true)
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	/*
	 	public boolean eliminar(int idUsuario) {
		Optional<Usuario> optUsuario = repositorio.findById(idUsuario);
		if (optUsuario.isPresent()) {
			repositorio.deleteById(idUsuario);
			return true;
		} else {
			throw new UsuarioNoEncontradoException("Usuario no existe: "+idUsuario);
		}
		
	}
	 */

	@Transactional
	public boolean eliminar(int idCliente) {
		Optional<Cliente> optCliente = clienteRepository.findById(idCliente);
		if (optCliente.isPresent()) {
			clienteRepository.deleteById(idCliente);
			return true;
		} else {
			throw new IllegalArgumentException("Cliente no existe: "+idCliente);
		}
	}

}

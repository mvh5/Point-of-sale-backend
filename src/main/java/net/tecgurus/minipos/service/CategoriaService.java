package net.tecgurus.minipos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.minipos.model.Categoria;
import net.tecgurus.minipos.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Transactional
	public Categoria guardar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	
	@Transactional(readOnly=true)
	public List<Categoria> listar() {
		return categoriaRepository.findAll(Sort.by(Direction.ASC,"nombre"));
	}

}

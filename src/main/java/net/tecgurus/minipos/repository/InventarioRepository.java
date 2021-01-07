package net.tecgurus.minipos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.tecgurus.minipos.dto.InventarioDTO;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioDTO, Integer> {
	
	@Query(value = "CALL consulta_inventario_mvh();", nativeQuery = true)
	public List<InventarioDTO> consultarInventario();

}

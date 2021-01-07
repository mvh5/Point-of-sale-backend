package net.tecgurus.minipos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.tecgurus.minipos.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	@Query("SELECT p FROM Producto p WHERE p.nombre LIKE %:filtro% OR p.descripcion LIKE %:filtro% OR p.sku LIKE %:filtro% ")
	List<Producto> findByNombreOrDescripcionOrSku(@Param("filtro") String filtro);

}

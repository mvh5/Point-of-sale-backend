package net.tecgurus.minipos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tecgurus.minipos.model.Compraproducto;

@Repository
public interface CompraProductoRepository extends JpaRepository<Compraproducto, Integer> {

}

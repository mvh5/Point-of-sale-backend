package net.tecgurus.minipos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tecgurus.minipos.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {

}

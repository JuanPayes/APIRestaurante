package org.example.restaurante.repository;


import org.example.restaurante.entity.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Integer> {

}

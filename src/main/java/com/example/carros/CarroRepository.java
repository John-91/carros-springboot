package com.example.carros;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {

	List<Carro> findByTipo(String tipo); // crud fazer um servico de aplicaçao que vai listar , criar, deletar.

}

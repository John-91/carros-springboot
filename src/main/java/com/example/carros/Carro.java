package com.example.carros;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //QUANDO SALVAR UM CARRO ira adicionar um novo id
	private Long id;
	
	private String nome;
	private String tipo;

		
}

package com.example.carros;

import org.modelmapper.ModelMapper;

import lombok.Data;

@Data
public class CarroDTO {

	private Long id;
	private String nome;
	private String tipo;
	

	public static CarroDTO create(Carro c) { // model mapper para facilitar caso a classe tenha muitos atributos 
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(c, CarroDTO.class);
	}
}

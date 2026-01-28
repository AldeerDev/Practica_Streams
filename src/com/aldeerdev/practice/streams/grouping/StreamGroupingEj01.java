package com.aldeerdev.practice.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.model.Persona;

public class StreamGroupingEj01 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 01: groupingBy 
		 * Consigna: 
		 * 1. Lista de personas 
		 * 2. Agrupar por edad
		 */

		// Declaracion de la lista de personas
		List<Persona> personas = List.of(new Persona("Ana", 20),
				new Persona("Juan", 20), new Persona("Pedro", 30),
				new Persona("Lucia", 30), new Persona("Marta", 40));

		// realiza agrupacion por edad
		Map<Integer, List<Persona>> groupByEdad = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad));
		
		// muestra el resultado de la agrupacion
		groupByEdad.forEach((edad, group) -> {
			System.out.println("Edad: " + edad + " - " + group);
		});

	}

}

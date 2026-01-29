package com.aldeerdev.practice.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.PersonasData;
import com.aldeerdev.practice.model.Persona;

public class StreamGroupingEj03 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 03: nombres por edad. Consigna 1. Agrupar personas por edad
		 * 2. Guardar solo nombres
		 */

		// Lista de personas
		List<Persona> personas = PersonasData.getPersonasList();

		// agrupamos con gropingBy y mapeamos solo los nombres
		Map<Integer, List<String>> nombresPorEdad = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad, Collectors
						.mapping(Persona::getNombre, Collectors.toList())));
		
		// muestra el resultado por pantalla
		nombresPorEdad.forEach((edad, listNombre) -> {
			System.out.println("Edad: " + edad + " - Lista: " + listNombre);
		});
	}

}

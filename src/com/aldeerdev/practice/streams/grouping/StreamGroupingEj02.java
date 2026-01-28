package com.aldeerdev.practice.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.PersonasData;
import com.aldeerdev.practice.model.Persona;

public class StreamGroupingEj02 {

	public static void main(String[] args) {
		/*
		 * Ejercico 02: Cantidad por edad Consigna: dada una lista de Personas
		 * 1. Agrupar por edad 2. Obtener Map<Integer, Long>
		 */

		// inicializa la lista de personas
		List<Persona> personas = PersonasData.getPersonasList();

		// agrupar la cantidad de personas por edad
		Map<Integer, Long> cantidadXedad = personas.stream().collect(
				Collectors.groupingBy(Persona::getEdad, Collectors.counting()));

		// muestra cantidad de personas por edades
		cantidadXedad.forEach((edad, cantidad) -> {
			System.out.println("Edad: " + edad + "->" + cantidad);
		});

	}

}

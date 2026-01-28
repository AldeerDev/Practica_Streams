package com.aldeerdev.practice.streams.basic;

import java.util.List;

import com.aldeerdev.practice.model.Persona;

public class StreamEjercicio08 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 08: Stream con objetos 
		 * Consigna 
		 * 1. Lista de personas 
		 * 2. Filtrar mayores de 18 años 
		 * 3. Mostrar nombre y edad
		 */

		// declaracion de la lista de tipo persona
		List<Persona> personas = List.of(new Persona("Homero", 39),
				new Persona("Marge", 38), new Persona("Bart", 10),
				new Persona("Lisa", 8), new Persona("Maggie", 1),
				new Persona("Ned", 60));

		// filtra las personas mayores de 18 años y las muestra
		personas.stream().filter(persona -> persona.getEdad() > 18)
				.forEach(System.out::println);

	}

}

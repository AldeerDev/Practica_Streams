package com.aldeerdev.practice.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEjercicio06 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 06: Collect a List 1. Lista de nombres 2. Filtrar nombres
		 * con más de 4 letras 3. Guardar el resultado en una nueva List 4.
		 * Mostar la nueva lista
		 */

		// crear nueva lista de nombres
		List<String> nombres = List.of("Todd", "Marge", "Lisa", "Bart",
				"Maggie", "Homero", "Flanders");

		// filtrar y guardar nombres con mas de 4 letras
		List<String> nombresMas4 = nombres.stream()
				.filter(nombre -> nombre.length() > 4)
				.collect(Collectors.toList());
		
		// muestra la nueva lista 
		System.out.println("Lista nueva con nombres de mas de 4 letras");
		nombresMas4.stream().forEach(System.out::println);

	}

}

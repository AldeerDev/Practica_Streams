package com.aldeerdev.practice.streams.basic;

import java.util.List;

public class StreamEjercicio03 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 03: map Convertí todos los nombres a mayúsculas y mostralos
		 */

		// Declaracion de la lista de nombres
		List<String> nombres = List.of("Bart", "Homero", "Lisa", "Marge", "Maggie");

		// muestra los nombres de la lista en mayuscula
		nombres.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}

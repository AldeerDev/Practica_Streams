package com.aldeerdev.practice.streams;

import java.util.List;

public class StreamEjercicio02 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 02: filter
		 * Mostrar solo los nombres que tengan más de 4 letras
		 */

		// Declaracion de la lista de nombres
		List<String> nombres = List.of("Bart", "Homero", "Lisa", "Marge", "Maggie");

		// muestra los nombres con mas de 4 letras
		nombres.stream().filter(n -> n.length() > 4).forEach(System.out::println);

	}

}

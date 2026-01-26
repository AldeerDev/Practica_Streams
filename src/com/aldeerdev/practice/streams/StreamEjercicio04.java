package com.aldeerdev.practice.streams;

import java.util.List;

public class StreamEjercicio04 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 04: filter + map Mostrá en mayúsculas solo los nombres con más de 4
		 * letras
		 */

		// Declaracion de la lista de nombres
		List<String> nombres = List.of("Marge", "Bart", "Lisa", "Homero", "Maggie");

		// mostrando los nombres en mayuscula con mas de 4 letras
		nombres.stream().filter(n -> n.length() > 4).map(String::toUpperCase).forEach(System.out::println);
	}

}

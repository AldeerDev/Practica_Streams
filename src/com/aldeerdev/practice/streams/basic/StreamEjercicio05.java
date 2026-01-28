package com.aldeerdev.practice.streams.basic;

import java.util.List;

public class StreamEjercicio05 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 05: count Contá cuántos nombres tienen más de 4 letras
		 */

		// Declaracion de la lista de nombres
		List<String> nombres = List
				.of("Bart", "Maggie", "Lisa", "Marge", "Homero");

		// contar la cantidad de nombres con mas de 4 letras
		Long cant = nombres
				.stream()
				.filter(nombre -> nombre.length() > 4)
				.count();

		// muestra la cantidad de nombres con mas de 4 letras por pantalla
		System.out
				.println("Cantidad de nombres con mas de 4 letras: " + cant);
	}
}

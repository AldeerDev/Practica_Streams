package com.aldeerdev.practice.streams.basic;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEjercicio07 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 07: collect a Set 1. Lista de nombres duplicados 2. Usar
		 * Stream 3. Obener un Set sin duplicados 4. mostrarlo
		 */

		// Lista de nombres duplicados
		List<String> nombresDuplicados = List.of("Homero", "Homero", "Marge",
				"Marge", "Maggie");
		
		// Set de nombres
		Set<String> nombresUnicos = nombresDuplicados.stream().collect(Collectors.toSet());
		
		// muestra los nombres unicos
		System.out.println("Nombres unicos");
		nombresUnicos.stream().forEach(System.out::println);

	}

}

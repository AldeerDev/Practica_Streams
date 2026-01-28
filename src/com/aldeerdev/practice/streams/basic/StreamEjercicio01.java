package com.aldeerdev.practice.streams.basic;

import java.util.List;

public class StreamEjercicio01 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 01: Stream
		 * Recorrrer Una lista de nombres con stream*/
		
		// Declaracion de una lista de nombres
		List<String> nombres	= List.of("Homero", "Bart", "Lisa", "Marge", "Maggie");
		
		// Recorrer la lista con stream y mostrar
		nombres.stream().forEach(System.out::println);
	}
}

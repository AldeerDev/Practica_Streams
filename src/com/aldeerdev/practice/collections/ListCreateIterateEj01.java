package com.aldeerdev.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCreateIterateEj01 {
	
	/*
	 * 1. Crear una List<String> usando ArrayList
	 * 2. Agregar 5 nombres
	 * 3. Mostrar los nombres usando: 
	 * 		+ for-each
	 * 		+ forEach + lambda
	 * 		+ forEach + method reference
	 * */
	public static void main(String[] args) {
		// Creando lista de String con ArrayList
		List<String> nombres = new ArrayList<String>();
		
		// cargar la lista de nombres
		nombres.add("Homero");
		nombres.add("Lisa");
		nombres.add("Marge");
		nombres.add("Bart");
		nombres.add("Maggie");
		
		// Recorrer lista con for each
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		// forEach mas lamda
		nombres.forEach(nombre -> System.out.println(nombre));
		
		// forEach + method reference
		nombres.forEach(System.out::println);

	}

}

package com.aldeerdev.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDuplicatesEj03 {

	public static void main(String[] args) {
		/*
		 * 1. Crear una List<String>
		 * 2. Agregar Valores repetidos
		 * 3. Mostrar:
		 * 		+ Tamaño de la lista
		 * 		+ Tdos los elementos
		 * */
		
		// 1. Creando la Lista de elementos duplicados
		List<String> elementoDuplicados = new ArrayList<String>();
	
		// 2. Agregando valores repetidos
		elementoDuplicados.add("Banana");
		elementoDuplicados.add("Manzana");
		elementoDuplicados.add("Banana");
		elementoDuplicados.add("Uva");
		elementoDuplicados.add("Uva");
		elementoDuplicados.add("Manzana");
		
		// 3.a. Mostrando tamaño de la lista
		System.out.println("El tamaño de la lista es: " + elementoDuplicados.size());
		
		// 3.b. Mostrar todos los elementos
		System.out.println("Todos los elementos de la lista: ");
		System.out.println(elementoDuplicados);
	}

}

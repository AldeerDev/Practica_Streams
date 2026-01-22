package com.aldeerdev.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListIndexAccessEj02 {

	public static void main(String[] args) {
		/*consigna
		 * 1. Crear una List<Integer>
		 * 2. Agregar 5 números
		 * 3. Mostrar:
		 * 		+ el primer elemento
		 * 		+ el ultimo elemento
		 * 4. modificar el valor del indice 2
		 * 5.  volver a mostrar la lista
		 * */
		
		// 1. creamos la lista
		List<Integer> numeros = new ArrayList<Integer>();
		
		// 2. Agregamos 5 numeros
		numeros.add(4);
		numeros.add(2);
		numeros.add(20);
		numeros.add(15);
		numeros.add(10);
		
		// 3. Mostrar el primer elemento
		System.out.println("El primer elemento: " + numeros.get(0));
		
		// 3. Mostrar el ultimo elemento
		System.out.println("El ultimo elemento: "+ numeros.get(numeros.size()-1));
		
		// 4. modificamos el valor del indice 2
		numeros.set(2, 8);
		
		// 5. Mostramos la lista
		numeros.forEach(System.out::println);

	}

}

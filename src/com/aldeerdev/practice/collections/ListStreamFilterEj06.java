package com.aldeerdev.practice.collections;

import java.util.ArrayList;

import java.util.List;

import com.aldeerdev.practice.utils.RandomUtils;

public class ListStreamFilterEj06 {

	public static void main(String[] args) {
		/*
		 * 1. Lista de numeros. 2. Filtrar solo los mayores a 18 3. Mostrar resultados
		 */

		// 1. Creando una lista de numeros
		List<Integer> numeros = new ArrayList<Integer>();

		// cargamos los numeros aleatorios usando RandomUtils
		for (int i = 0; i < 10; i++) {
			numeros.add(RandomUtils.intBetwnn(1, 100));
		}

		// 2. Filtramos los numeros mayores a 18 y 3. mostramos resultado
		numeros.stream().filter(n -> n > 18).forEach(System.out::println);
	}

}

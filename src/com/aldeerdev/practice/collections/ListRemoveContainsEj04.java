package com.aldeerdev.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveContainsEj04 {

	public static void main(String[] args) {
		/*
		 * 1. Crear una List<String>
		 * 2. Verificar si existe un elemento (contains)
		 * 3. Eliminar un elemento (remove)
		 * 4. Mostrar la Lista final
		 * */
		
		// 1. Creando la List<String> de productos
		List<String> productos = new ArrayList<String>();
		
		// Cargando la lista de productos
		productos.add("Laptop HP");
		productos.add("Impresora CANNON");
		productos.add("Mouse RED DRAGON");
		productos.add("Auricular");
		productos.add("Auriculare Inalambrico");
		productos.add("Mini parlantes JBL");
		productos.add("Laptop LENOVO");
		productos.add("Joystick T-DAGGER");
		
		// 2. Verificar que existe Auriculares
		System.out.println("¿Existe el elemento 'Auricular'?");
		System.out.println(productos.contains("Auricular"));
		
		// 3. Eliminamos el elemento Auricular Inalambrico
		productos.remove("Auriculares Inalambrico");
		
		// 4. Mostrando la lista final
		System.out.println("Mostrando los elementos de la lista");
		System.out.println(productos);

	}

}

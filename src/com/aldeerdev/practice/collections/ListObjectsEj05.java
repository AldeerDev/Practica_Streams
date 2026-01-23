package com.aldeerdev.practice.collections;

import java.util.ArrayList;
import java.util.List;

import com.aldeerdev.practice.model.Persona;

public class ListObjectsEj05 {

	public static void main(String[] args) {
		/*
		 * 1. Usar la clase Persona. 2. Crear una List<Persona> 3. Agregar varias
		 * personas 4. Mostrar nombre y edad
		 */

		// 2. Creando una lista de personas
		List<Persona> personas = new ArrayList<Persona>();

		// 3. Cargando personas a la lista
		/*
		 * uso del constructor de la clase Persona para crear dicho objeto y agregarlos
		 * a personas
		 */
		personas.add(new Persona("Homero", 38));
		personas.add(new Persona("Marge", 34));
		personas.add(new Persona("Lisa", 10));
		personas.add(new Persona("Bart", 8));
		personas.add(new Persona("Maggie", 1));

		// 4. Mostrando nombre y apellido de la lista de personas
		for (Persona persona : personas) {
			System.out.println(persona.getNombre() + "(" + persona.getEdad() + ")");
		}

	}

}

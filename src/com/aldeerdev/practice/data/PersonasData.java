package com.aldeerdev.practice.data;

import java.util.List;

import com.aldeerdev.practice.model.Persona;

public class PersonasData {

	private PersonasData() {
	}
	
	public static List<Persona> getSimpsonsList() {
		return List.of(
				new Persona("Homero", 39),
				new Persona("Marge", 36),
				new Persona("Lisa", 8),
				new Persona("Bart", 10),
				new Persona("Maggie", 1),
				new Persona("Ned", 60),
				new Persona("Apu", 45),
				new Persona("Milhouse", 10),
				new Persona("Burns", 104)
				);
	}
	
	public static List<Persona> getPersonasList() {
		return List.of(
				new Persona("Lucas", 25),
				new Persona("Maria", 30),
				new Persona("Juan", 25),
				new Persona("Ana", 40),
				new Persona("Pedro", 30),
				new Persona("Sofia", 35),
				new Persona("Diego", 40),
				new Persona("Valentina", 28),
				new Persona("Martin", 35),
				new Persona("Carla", 25)
				);
	}
}

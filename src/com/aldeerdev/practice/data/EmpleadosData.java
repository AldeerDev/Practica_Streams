package com.aldeerdev.practice.data;

import java.util.List;

import com.aldeerdev.practice.model.Empleado;

public class EmpleadosData {
	
	public static List<Empleado> getEmpleados() {
		return List.of(
				new Empleado("Juan", 32, 1L, "IT", 250000),
				new Empleado("Ana", 28, 2L, "IT", 180000),
				new Empleado("Pedro", 40, 3L, "IT", 320000),
				new Empleado("Lucia", 35, 4L, "IT", 210000),
				new Empleado("Carlos", 45, 5L, "RRHH", 150000),
				new Empleado("Sofia", 29, 6L, "RRHH", 170000),
				new Empleado("Marcos", 33, 7L, "RRHH", 160000),
				new Empleado("Laura", 31, 8L, "VENTAS", 200000),
				new Empleado("Diego", 38, 9L, "VENTAS", 300000),
				new Empleado("Valeria", 24, 10L, "VENTAS", 280000),
				new Empleado("Juan", 34, 11L, "VENTAS", 220000),
				new Empleado("Martin", 41, 12L, "CONTABILIDAD", 190000),
				new Empleado("Paula", 36, 13L, "CONTABILIDAD", 210000)
				);
	}
}

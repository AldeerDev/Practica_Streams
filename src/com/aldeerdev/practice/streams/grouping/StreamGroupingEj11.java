package com.aldeerdev.practice.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj11 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 11: Particionar empleados por salario alto: considerar
		 * salario alto si es mayor a 200000 y devolver un Map<Boolean,
		 * List<Empleado>>.
		 */

		// Lista de empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();

		Map<Boolean, List<Empleado>> salariosMay = empleados.stream()
				// particiona empleados por salario
				.collect(Collectors
						// condicion de particion
						.partitioningBy(emp -> emp.getSalario() > 200000));

		// imprime resultado de la particion
		System.out.println("Empleados con salario mayor a 200000:");
		salariosMay.get(true).forEach(System.out::println);
	}
}

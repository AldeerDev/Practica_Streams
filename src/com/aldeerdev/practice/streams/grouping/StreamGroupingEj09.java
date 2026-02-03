package com.aldeerdev.practice.streams.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj09 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 09: Nombres únicos de empleados mayores de 30 años:
		 * devolver una List<String> con nombres sin duplicados y ordenados
		 * alfabéticamente
		 */
		
		// Lista de empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();
		
		List<String> nombresEmpMay30 = empleados.stream()
				// filtra empleados mayores a 30 años
				.filter(emp -> emp.getEdad() > 30)
				// mapea el nombre de los empleados
				.map(Empleado::getNombre)
				// elimina nombres duplicados
				.distinct()
				// ordena de forma natural A-Z
				.sorted()
				// transforma resultado a lista de nombres
				.collect(Collectors.toList());
		
		// muestra empleados mayor a 30 años
		System.out.println("Empleados mayor a 30 años: ");
		nombresEmpMay30.stream().forEach(System.out::println);

	}

}

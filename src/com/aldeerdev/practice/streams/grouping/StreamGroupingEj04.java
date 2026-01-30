package com.aldeerdev.practice.streams.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj04 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 04: top 3 salarios por departamento Consigna devolver un
		 * Map de los 3 empleados mejor pagado de cada departamento
		 */

		// Trae los datos de los empleados a una lista de Empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();

		// Variable para guardar el resultado de las operaciones
		Map<String, List<Empleado>> salarioPorDepartamento = empleados.stream()
			// agrupamos por departamento
			.collect(Collectors.groupingBy(Empleado::getDepartamento,
					// realiza tratamiento de la lista de empleados
					Collectors.collectingAndThen(
						// recolecta empleados del departamento
						Collectors.toList(),
						
						// transformamos la lista
						list -> list.stream()
							// ordenamos empleados por salario descendente
							.sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
							
							// Limitamos a 3 empleados 
							.limit(3).toList())));
		
		// muestra el resultado de los 3 mejores empleados pagados por departamento
		salarioPorDepartamento.forEach(
				// recorremos el map
				(dpto, listEmp) -> {
					// mostramos el nombre del departamento
					System.out.println("Departamento: " + dpto);
					// recorremos la lista de empleado por departamento
					listEmp.forEach(System.out::println);
				});

	}

}

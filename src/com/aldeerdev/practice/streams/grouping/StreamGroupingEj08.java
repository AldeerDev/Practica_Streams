package com.aldeerdev.practice.streams.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj08 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 08: Empleado mejor pago por departamento: devolver un
		 * Map<String, Empleado> donde cada departamento tenga asociado su
		 * empleado con mayor salario.
		 */

		// trae los datos de la lista de empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();

		Map<String, Empleado> empMejorSalDepto = empleados.stream().collect(
				// agrupa por departamento
				Collectors.groupingBy(Empleado::getDepartamento,
						Collectors.collectingAndThen(
								// devuelve el empleado de mayor salario
								Collectors.maxBy(Comparator
										.comparingDouble(Empleado::getSalario)),
								Optional::get)));

		// muestra el empleado con mayor salario de cada departamento
		empMejorSalDepto.forEach((dept, emp) -> {
			System.out.println("Departamento: " + dept);
			System.out.println("Empleado: " + emp);
		});
	}

}

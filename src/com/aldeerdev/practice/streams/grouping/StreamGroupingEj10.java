package com.aldeerdev.practice.streams.grouping;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj10 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 10: Estadísticas salariales por departamento: devolver un
		 * Map<String, DoubleSummaryStatistics> con mínimo, máximo, promedio y
		 * cantidad de salarios.
		 */

		// Lista de empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();

		// Tratamiento de la lista de empleados
		Map<String, DoubleSummaryStatistics> statsDepts = empleados.stream()
				// agrupa por departamento
				.collect(Collectors.groupingBy(Empleado::getDepartamento,
						// devuelve Estadistica de salario max, min, count, avg
						Collectors.summarizingDouble(Empleado::getSalario)));

		// muestra reporte de estadistico por departamento
		statsDepts.forEach((dept, stats) -> {
			System.out.println("Departamento: " + dept);
			System.out.println("\tSalario minimo: " + stats.getMin());
			System.out.println("\tSalario maximo: " + stats.getMax());
			System.out.println("\tPromedio: " + stats.getAverage());
			System.out.println("\tCantidad de salarios: " + stats.getCount());
		});
	}

}

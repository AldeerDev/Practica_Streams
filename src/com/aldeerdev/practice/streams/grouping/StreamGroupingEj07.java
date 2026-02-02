package com.aldeerdev.practice.streams.grouping;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj07 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 07: Suma de salarios por departamento ordenada: devolver un
		 * LinkedHashMap<String, Double> ordenado de mayor a menor según la suma
		 * de salarios
		 */
		
		// trae lista de empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();
		
		// devuelve salario total por departamento ordenado de  mayor a menor
		Map<String, Double> salarioDepartamentos = empleados
				.stream()
				// agrupa empleados por departamento
				.collect(Collectors.groupingBy(
						Empleado::getDepartamento,
						// suma total salarios por departamento
						Collectors.summingDouble(Empleado::getSalario)
						))
				.entrySet()
				.stream()
				// ordena de mayor a menor salario
				.sorted(
						// compara los valores
						Map.Entry.<String, Double>comparingByValue().reversed())
				.collect(Collectors.toMap(
							// define clave nombre del departamento
							Map.Entry::getKey,
							// define valor salario total del departamento
							Map.Entry::getValue,
							// funcion merge si existe duplicado
							(a, b) -> a,
							// tipo de mapa ordenado
							LinkedHashMap::new
						));
		
		// muestra el resultado de la operacion
		salarioDepartamentos.forEach(
				(dept, salario) -> {
					System.out.println("Departamento: " + dept + " - Salario Total: " +salario);
				});
	}

}

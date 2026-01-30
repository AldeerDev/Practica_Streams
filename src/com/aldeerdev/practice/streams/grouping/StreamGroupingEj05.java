package com.aldeerdev.practice.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj05 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 05: Departamento con mayor salario promedio
		 * */
		
		// trae los datos de los empleados
		List<Empleado> empleados = EmpleadosData.getEmpleados();
		
		// guarda el salario promedio por departamento
		Optional<String> departamentoConOptionalMejorProm = empleados
				.stream()
				// Agrupa por departamento
				.collect(Collectors.groupingBy(
						Empleado::getDepartamento,
						// promedio de salario por depto
						Collectors.averagingDouble(Empleado::getSalario)
						))
				.entrySet()
				.stream()
				// compara el mayor salario promedio
				.max(Map.Entry.comparingByValue())
				// devuelve el nombre del departamento con mayor valor
				.map(Map.Entry::getKey);
		
		// muestra el nombre del departamento con mayor salario promedio
		System.out.println(departamentoConOptionalMejorProm.get());

	}

}

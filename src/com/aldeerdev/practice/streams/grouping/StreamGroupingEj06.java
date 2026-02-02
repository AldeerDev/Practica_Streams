package com.aldeerdev.practice.streams.grouping;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.aldeerdev.practice.data.EmpleadosData;
import com.aldeerdev.practice.model.Empleado;

public class StreamGroupingEj06 {

	public static void main(String[] args) {
		/*
		 * Ejericicio 06: Empleados con salario por encima del promedio global:
		 * devolver una List<Empleado> con los empleados cuyo salario sea mayor
		 * al promedio de toda la empresa
		 */
		
		// trae datos de empleados en una lista
		List<Empleado> empleados = EmpleadosData.getEmpleados();
		
		// saca el promedio global de empleados
		double promedioGlobal = empleados.stream()
				.mapToDouble(Empleado::getSalario)
				.average()
				.orElse(0);
		
		// obtiene los empleados con salario mayor al promedio
		List<Empleado> empSalarioMayProm = empleados
				.stream()
				.filter(emp -> emp.getSalario() > promedioGlobal)
				.collect(Collectors.toList());
		
		// muestra la lista de empleados obtenida
		System.out.println("Empleados con salario mayor al promedio");
		empSalarioMayProm.stream().forEach(System.out::println);
	}

}

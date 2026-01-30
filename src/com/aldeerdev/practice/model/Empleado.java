package com.aldeerdev.practice.model;

public class Empleado extends Persona {
	
	private Long id;
	private String departamento;
	private double salario;
	
	public Empleado(String nombre, int edad, Long id, String departamento,
			double salario) {
		super(nombre, edad);
		this.id = id;
		this.departamento = departamento;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "{id: " + id +
				", nombre: " + getNombre() +
				", departamento: " + departamento +
				", salario: " + salario + "}";
	}
	
	

}

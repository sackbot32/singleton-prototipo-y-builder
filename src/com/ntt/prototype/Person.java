package com.ntt.prototype;

public class Person implements IHumano {
	
	private String nombre;
	private int edad;
	
	
	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
		
	}
	
	public static class PersonBuilder {
		private String nombre;
		private int edad;
		
		public PersonBuilder edad(int edad) {
			this.edad = edad;
			return this;
		}
		
		public PersonBuilder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		public Person build() {
			return new Person(this.nombre,this.edad);
		}
	}
	
	public Person clone() {
		
		return new Person(this.nombre,this.edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "PersonaTipo1 [nombre=" + nombre + ", edad=" + edad + "]";
	}

}

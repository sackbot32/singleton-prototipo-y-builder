package com.ntt.prototype;

public class PersonaTipo2 implements IHumano {
	
	private String nombre;
	private int edad;
	
	
	public PersonaTipo2(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public PersonaTipo2 clone() {
		
		return new PersonaTipo2(this.nombre,this.edad);
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

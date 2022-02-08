package com.ntt.singleton;

public class SingletonPrueba {
	 
	private String nombre;
	private int edad;
	private static SingletonPrueba humano;
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static SingletonPrueba getInstance() {
		if(humano == null) {
			humano = new SingletonPrueba();
			humano.setEdad(20);
			humano.setNombre("Alberto");
			}
			return humano;
	}
	
	
	

}

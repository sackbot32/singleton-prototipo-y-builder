package com.ntt;

import com.ntt.prototype.Person;

public class Main {

	public static void main(String[] args) {

		Person persona = Person.builder().edad(27).nombre("pepe").build();
		
		System.out.println(persona);
		
	}

}

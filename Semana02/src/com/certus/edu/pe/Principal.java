package com.certus.edu.pe;

public class Principal {

	public static void main(String[] args) {
		
		Rectangulo r1= new Rectangulo (10,10);
		Rectangulo r2= new Rectangulo(20, 20);
		System.out.println(r1);
		
		System.out.println(r2);
		System.out.println("Rectangulos creados : " + Rectangulo.getRectanguloCreados());
		

	}

}

package com.certus.edu.pe;

public class Rectangulo {

	private int base;
	private int altura;
	private static int rectangulosCreados;
	
	public Rectangulo(int base, int altura) {
		this.base= base;
		this.altura= altura;
		rectangulosCreados++;
		
	}
	
	public static int getRectanguloCreados() {
		return rectangulosCreados;
		
	}
	
	
	public String toString() {
		String cadena = "";
		for (int i=0; i < altura ; i++) {
			for (int j=0; j < base; j++) {
				cadena += '$';
			}
			cadena += '\n';
		}
		
		return cadena;
	}
	
	
	
}

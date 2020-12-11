package com.capacitacion2.capacitacion2.clase6assertion;

public class MultiMetodo {

	public String getPalabra (String finalPalabra) {
		return "Palabra" + finalPalabra;
		
	}
	
	public char[] getArregloCaracteres(String palabra) {
		char[] arreglo = new char[palabra.length()];
		for (int i=0; i<palabra.length();i++)
		{
			arreglo[i]= palabra.charAt(i);
		}
		return arreglo;
	}
	
	public boolean getOpositive (boolean valor) {
		return !valor;
	}
	
	
	public int dividir (int dividendo, int divisor) {
		return dividendo/divisor;
	}
	
	public double dividir1 (double dividendo, double divisor) {
		return dividendo/divisor;
	}
	
	public int dividir2 (int dividendo, int divisor) {
		return dividendo/divisor;
	}
	
	public String metodoNulo() {
		return null;
		
	}
	
	public void timeOut() {
		try {
			Thread.sleep(1000);	
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
}

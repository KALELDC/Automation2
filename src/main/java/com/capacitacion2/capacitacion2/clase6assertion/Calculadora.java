package com.capacitacion2.capacitacion2.clase6assertion;

public class Calculadora {
	int a = 0;
	int b = 0;

 public void menu(int opc) {
	switch (opc) {
	
	case 1 :
		this.suma( a, b);
	break;	

	case 2 :
		this.resta( a, b);
	break;	

	case 3 :
		this.multi( a, b);
	break;

	case 4 :
		this.divi( a, b);
	break;
	
	}
}
	
	public int suma (int a, int b ) {
		return a + b;
	}
	
	public int resta (int a, int b ) {
		return a - b;
	}
	
	public int multi (int a, int b ) {
		return a * b;
	}
	
	public int divi (int a, int b ) {
		return a/b;
	}
	
	
	
}

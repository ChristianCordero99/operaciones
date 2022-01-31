package com.ZonaInfo.operaciones;

public class operaciones {
	
	
	private int val1;
	private int val2;
	
	public void Suma() {
		int suma=val1+val2;
		System.out.print("La suma es: " + suma);
	}
	
	
	public void Resta() {
		int resta=val1-val2;
		System.out.print("La resta es: " + resta);
	}
	
	public void Multiplicar() {
		int mult=val1*val2;
		System.out.print("La multiplicacion es es: " + mult);
	}
	
	public void Dividir() {
		int div=val1/val2;
		System.out.print("La division es es: " + div);
	}


	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	
}

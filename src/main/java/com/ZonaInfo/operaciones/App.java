package com.ZonaInfo.operaciones;

import java.awt.print.Printable;

public class App 
{
    public static void main( String[] args )
    {
    	Calculadora calculadora=new Calculadora();
    	calculadora.setVal1(10);
    	calculadora.setVal2(12);
    	calculadora.Suma();
        
        System.out.println(" ");
        System.out.println(" ");
        
        calculadora.setVal1(400);
    	calculadora.setVal2(60);
    	calculadora.Resta();
        
        System.out.println(" ");
        System.out.println(" ");
        
        calculadora.setVal1(60);
    	calculadora.setVal2(2);
    	calculadora.Multiplicacion();
        
        System.out.println(" ");
        System.out.println(" ");
        
        calculadora.setVal1(30);
    	calculadora.setVal2(2);
    	calculadora.Dividir();
    }
    
    
    
}

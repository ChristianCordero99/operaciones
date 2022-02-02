package com.ZonaInfo.operaciones;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Domain.Cliente;

public class App {
    public static void main( String[] args )    {
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
    	
    	System.out.println(" ");
        System.out.println(" ");
        
        Cliente cliente=new Cliente();
        cliente.setCedula("030");
        cliente.setNombre("Christian Cordero");
        cliente.setDireccion("Azogues");
        cliente.setMail("christian.cordero@insteclrg.edu.ec");
        cliente.setFechaNacimiento(Date.valueOf("1999-05-09"));
        
        System.out.println(" ");
        System.out.println(" ");
        
        Cliente cliente2=new Cliente();
        cliente2.setCedula("030");
        cliente2.setNombre("Christian Cordero");
        cliente2.setDireccion("Azogues");
        cliente2.setMail("christian.cordero@insteclrg.edu.ec");
        cliente2.setFechaNacimiento(Date.valueOf("1999-05-09"));
        
        System.out.println(cliente.getCedula());
        
        System.out.println(" ");
        System.out.println(" ");
      
        
        System.out.println(edad(new GregorianCalendar(1998,05,9)));
        
    }
        
		public static int edad(Calendar CalcularEdad) {
            Calendar fecha = Calendar.getInstance();
            
            int anio = fecha.get(Calendar.YEAR) - CalcularEdad.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) - CalcularEdad.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH) - CalcularEdad.get(Calendar.DAY_OF_MONTH);
     
     
            if(mes < 0 || (mes==0 && dia < 0)){
                anio--;
            }
            
            System.out.println("Tu edad actual es: ");
			return anio;
        
    }
    
}

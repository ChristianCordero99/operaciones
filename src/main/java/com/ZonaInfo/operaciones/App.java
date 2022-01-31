package com.ZonaInfo.operaciones;

import java.awt.print.Printable;

public class App 
{
    public static void main( String[] args )
    {
        operaciones Operaciones= new operaciones();
        Operaciones.setVal1(10);
        Operaciones.setVal2(12);
        Operaciones.Suma();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Operaciones.setVal1(400);
        Operaciones.setVal2(60);
        Operaciones.Resta();
    }
    
    
    
}

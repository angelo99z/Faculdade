
package com.mycompany.programacao2_mapa;

import java.lang.Math;
import java.util.Scanner;

public class Programacao2_mapa {
    
    
    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
            
        
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("\nCalculando delta...");
            System.out.println("Delta: " + delta);
            System.out.println("\nX1: "+ x1);
            System.out.println("X2: " + x2);
        } 
        return delta;
    }
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe os valores de A, B e C: \na: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();
        System.out.print("c: ");
        int c = teclado.nextInt();
        
        try {
        calcularDelta(a, b, c);
    }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
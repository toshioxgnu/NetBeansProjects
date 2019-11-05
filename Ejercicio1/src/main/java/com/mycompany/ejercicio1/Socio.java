package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Socio {
    Scanner sc = new Scanner(System.in);
    
    String nombre;
    int antiguedad;

    public Socio() {
        System.out.println("Ingrese nombre");
        this.nombre = sc.next();
        System.out.println("Ingrese antiguedad");
        this.antiguedad = sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }
    
    
  
}

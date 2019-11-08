package com.mycompany.club;

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
        System.out.println("Ingrese Nombre");
        this.nombre = sc.next();
        System.out.println("Ingrese antiguedad");
        this.antiguedad = sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    
    
}

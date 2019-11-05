package com.mycompany.ejercicio1;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
       Socio socio1 = new Socio();
       Socio socio2 = new Socio();
       Socio socio3 = new Socio();
        
       Club club = new Club(socio1,socio2,socio3);
       
       String masAntiguo = club.mayorAntiguedad();
        System.out.println("EL miembro mas antiguo es "+ masAntiguo);
    }
    
}

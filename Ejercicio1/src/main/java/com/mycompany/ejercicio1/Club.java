package com.mycompany.ejercicio1;

/**
 * 
 * @author jose
 * @system Linux Mint 19.2  
 * 
 */
public class Club {
    Socio socio1;
    Socio socio2;
    Socio socio3;

    public Club(Socio socio1, Socio socio2, Socio socio3) {
        this.socio1 = socio1;
        this.socio2 = socio2;
        this.socio3 = socio3;
    }
    
    
    public String mayorAntiguedad(){
        if(socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad ){
            return socio1.getNombre();
        }
        if(socio2.antiguedad > socio1.antiguedad && socio2.antiguedad > socio3.antiguedad ){
            return socio2.getNombre();
        }
        if(socio3.antiguedad > socio2.antiguedad && socio3.antiguedad > socio1.antiguedad ){
            return socio3.getNombre();
        }else{return null;}
    }   
}

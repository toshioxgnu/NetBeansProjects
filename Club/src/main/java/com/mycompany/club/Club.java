package com.mycompany.club;

/**
 *
 * @author jose
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
        if (socio1.getAntiguedad() > socio2.getAntiguedad() & socio1.getAntiguedad() > socio3.getAntiguedad() ){
            return "El socio de mayor antiguedad es " + socio1.getNombre() ;
        }if (socio2.getAntiguedad() > socio1.getAntiguedad() & socio2.getAntiguedad() > socio3.getAntiguedad() ){
            return "El socio de mayor antiguedad es " + socio2.getNombre() ;
        }if (socio3.getAntiguedad() > socio2.getAntiguedad() & socio3.getAntiguedad() > socio1.getAntiguedad() ){
            return "El socio de mayor antiguedad es " + socio3.getNombre() ;
        }
        return null;
    }
}

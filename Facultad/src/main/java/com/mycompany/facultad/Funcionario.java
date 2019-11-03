/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facultad;

/**
 *
 * @author jose
 */
public class Funcionario extends Persona {
    String funcion;

    public Funcionario(String funcion, String nombre, int edad) {
        super(nombre, edad);
        this.funcion = funcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    
}

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
public class main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Analista Programador","Manuel",48);
        Docente docente = new Docente("Contabilidad","Mauricio",57);
        Funcionario funcionario = new Funcionario("Casino","Armando", 78);
        
        System.out.println("Estudiante: \n" +"\nnombre"+estudiante.getNombre() +
                "\nEdad: " + estudiante.getEdad() +
                "\nCarrera:" + estudiante.getCarrera());
         System.out.println("Docente:\n" +"\nnombre"+docente.getNombre() +
                "\nEdad: " + docente.getEdad() +
                "\nCarrera:" + docente.getCarrera());
          System.out.println("Funcionario: \n" +"\nnombre"+funcionario.getNombre() +
                "\nEdad: " + funcionario.getEdad() +
                "\nCarrera:" + funcionario.getFuncion());
          
        
        
        
        
        
    }
    
}

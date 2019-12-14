/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba4ejercicio2;

/**
 *
 * @author jose
 */
public class Node {
    char data;
    Node izq;
    Node der;
    
    public Node(char data){
        this.data = data;
        izq = der = null;
    }
}

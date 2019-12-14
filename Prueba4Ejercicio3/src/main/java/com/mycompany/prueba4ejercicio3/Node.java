package com.mycompany.prueba4ejercicio3;

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

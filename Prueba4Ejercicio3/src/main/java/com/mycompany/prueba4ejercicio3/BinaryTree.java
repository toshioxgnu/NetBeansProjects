/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba4ejercicio3;

/**
 *
 * @author jose
 */
public class BinaryTree {
    Node root;
    

    
    BinaryTree(){
        root = null;
    }
    
    void preOrden(Node node){
        if (node == null){
            return;}
        
        System.out.println("Nodo : " + node.data);
        preOrden(node.izq);  
        preOrden(node.der);
        
        
        
               
    }
    void postOrden(Node node){
        if (node == null){
            return;}
        
        
        preOrden(node.izq);  
        preOrden(node.der);
        System.out.println("Nodo : " + node.data);
        
        
        
               
    }
    void postOrden(){postOrden(root);} 
    void preOrden(){preOrden(root);} 
}

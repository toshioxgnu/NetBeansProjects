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
public class Main {
    public static void main(String[] args) {
         BinaryTree Arbol = new BinaryTree();
        
        // Creamos la raiz
        Arbol.root = new Node('#');
        
        /*  
  
              # 
            /   \ 
          null  null     */
        
        Arbol.root.izq = new Node('@');
        Arbol.root.der = new Node('$');
        
        /*  
               # 
             /   \ 
            @      $ 
           /  \    /  \ 
        null null null null  */
        Arbol.root.izq.izq = new Node('&');
        /*
                    # 
                /       \ 
               @          $
             /   \       /  \ 
             &   null  null null 
            / \              
          null null   
         */ 
        System.out.println("Post Orden");
        Arbol.preOrden(Arbol.root);
    }
}

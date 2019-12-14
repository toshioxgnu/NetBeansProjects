package com.mycompany.prueba4ejercicio1;

/**
 *
 * @author jose
 */
public class BinaryTree {
    Node root;
    

    
    BinaryTree(){
        root = null;
    }
    
     void postOrden(Node node){
        if (node == null){
            return;}
        
        postOrden(node.izq);
        postOrden(node.der);
        
        System.out.println("Nodo : " + node.data);
        
               
    }
    void postOrden(){postOrden(root);} ;
     
     
    
}

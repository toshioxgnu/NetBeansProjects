package com.mycompany.prueba4ejercicio1;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree Arbol = new BinaryTree();
        
        // Creamos la raiz
        Arbol.root = new Node('r');
        
        /* 
  
              r 
            /   \ 
          null  null     */
        
        Arbol.root.izq = new Node('s');
        Arbol.root.der = new Node('m');
        
        /* 
               r 
             /   \ 
            s      m 
          /    \    /  \ 
        null null null null  */
        Arbol.root.der.izq = new Node('k');
        Arbol.root.der.der = new Node('g');
        Arbol.root.izq.izq = new Node('p');
        Arbol.root.izq.der = new Node('w');
        /*  
                    r 
                /       \ 
               s          m
             /   \       /  \ 
             p   w       k   g
            /     \      /   \      
            null  null  null nu
         */ 
        System.out.println("Post Orden");
        Arbol.postOrden(Arbol.root);
    }
    
   
        
}

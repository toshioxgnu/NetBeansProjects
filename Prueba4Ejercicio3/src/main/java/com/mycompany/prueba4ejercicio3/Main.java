package com.mycompany.prueba4ejercicio3;

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
    Arbol.root.der = new Node('t');

    /* 
           r 
         /   \ 
        s     t   */
    Arbol.root.izq.izq = new Node('u');
    Arbol.root.izq.der = new Node('v');
    Arbol.root.der.izq = new Node('w');
    Arbol.root.der.der = new Node('x');
    /* 
                r 
            /       \ 
           s          t
         /   \       /  \ 
        u    v      w   x     
       / \   /          /
       y  w  a          b
    */ 
       
    Arbol.root.izq.izq = new Node('y');
    Arbol.root.izq.der = new Node('w');
    Arbol.root.izq.der.izq = new Node('a');
    Arbol.root.der.der.izq = new Node('b');
    
    System.out.println("Pre Orden");
    Arbol.preOrden(Arbol.root);
    System.out.println("Post Orden");
    Arbol.postOrden(Arbol.root);
    }
}

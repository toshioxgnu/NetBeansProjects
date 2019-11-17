package com.mycompany.listaenlazada;

/**
 *
 * @author jose
 */
public class Listaenlazada {
    private Node head;
    private int listCount;

    public Listaenlazada() {
        head = new Node(null, 0);
        listCount = 0;
    }
    
    //Agregar un elemento especifico a la lista
    public void add(int data){
        Node temp = new Node(null, data);
        Node actual = head;
       
        while(actual.getSig() !=null){
            actual = actual.getSig();
        }
        
        actual.setSig(temp);
        listCount ++;
            
    }
   
    
    
}

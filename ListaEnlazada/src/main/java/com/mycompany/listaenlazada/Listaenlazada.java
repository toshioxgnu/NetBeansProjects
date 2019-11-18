package com.mycompany.listaenlazada;

public class Listaenlazada {

    Node head;

    //Agregar un elemento a la lista
    public void add(int data) {
        Node node = new Node();
        node.data = data;

        // Comprueba si la lista esta vacia
        if (head == null) {

            head = node;
        } else {
            Node n = head;

            while (n.Sig != null) {
                n = n.Sig;

            }
            //se mueve al siguiente nodo
            n.Sig = node;
        }

    }

    //Remueve el nodo con la data enviada 
    public void removeData(int data) {
        Node temp = head, prev = null;

        // Si la cabeza se tiene que eliminar a si misma
        if (temp != null && temp.data == data) {
            head = temp.Sig;

        }

        while (temp != null && data != temp.data) {
            prev = temp;
            temp = prev.Sig;

        }

        prev.Sig = temp.Sig;

    }

    //Elimina el nodo ubicaco en la posicion enviada 
    public void removeNode(int posicion) {
        Node node = head, prev = null;
        int i = 0;

        //Si la posicion es 0 elimina la cabeza
        if (posicion == 0) {
            head = node.Sig;
        }

        //Recorre la lista hasta el nodo anterior al que queremos eliminar
        while (node != null && i < posicion - 1) {
            prev = node;
            node = node.Sig;
            i++;
        }
        //Elimina el nodo de la lista
        prev.Sig = node.Sig;
    }

    //Metodo para mostrar la lista
    public void show() {
        Node node = head;

        while (node.Sig != null) {
            System.out.println(node.data);
            node = node.Sig;
        }
        //Muestra el ultimo elemento de la lista de lo contrario de lo salta
        System.out.println(node.data);
    }

}

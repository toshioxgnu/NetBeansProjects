package com.mycompany.listaenlazada;

/**
 *
 * @author Eduardo Lopez Jose Gonzalez
 */
public class Main {

    public static void main(String[] args) {
        Listaenlazada lista = new Listaenlazada();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);

        lista.show();

        System.out.println("\n");
        lista.removeData(7);
        lista.show();
        System.out.println("\n");
        lista.removeNode(4);
        lista.show();

    }

}

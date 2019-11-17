package com.mycompany.listaenlazada;

/**
 *
 * @author jose
 */
public class Node {
    int data;
    Node Sig;

    public Node( Node Sig, int data) {
        this.data = data;
        this.Sig = Sig;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getSig() {
        return Sig;
    }

    public void setSig(Node Sig) {
        this.Sig = Sig;
    }
    
    
    
    
}

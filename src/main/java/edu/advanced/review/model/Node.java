package edu.advanced.review;

public class Node {

    private int codigo;
    private Node next;

    public Node() {
        System.out.println(this.toString() + " was instanced");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public void finalize() {
        System.out.println(this.toString() + " was finalized with the Garbage Collector");
    }
}

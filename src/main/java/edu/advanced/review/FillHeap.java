package edu.advanced.review;

public class FillHeap {

    String firstName;
    String lastName;
    FillHeap next;

    public FillHeap(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {

        FillHeap inicio = new FillHeap("a","b");
        FillHeap fillHeap = inicio;
        while (true) {
            FillHeap aux = new FillHeap("Nombre 1", "Nombre 2");
            fillHeap.next = aux;
            fillHeap = fillHeap.next;
            System.out.println(Runtime.getRuntime().freeMemory());
        }
    }

}

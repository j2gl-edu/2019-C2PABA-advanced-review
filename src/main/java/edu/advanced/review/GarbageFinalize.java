package edu.advanced.review;

import edu.advanced.review.model.Node;

public class GarbageFinalize {


    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();

        node1 = new Node();
        System.gc();

        System.out.println("1.- " + node1.toString());
    }


}

package edu.advanced.review.memory;

import edu.advanced.review.model.Node;

public class GarbageFinalize {


    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();

        node1 = new Node();
        System.gc();

        System.out.println("node1 - " + node1.toString());
        System.out.println("node2 - " + node2.toString());
    }


}

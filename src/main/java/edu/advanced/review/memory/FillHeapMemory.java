package edu.advanced.review.memory;

import edu.advanced.review.model.Node;

public class FillHeapMemory {

    private void fillMemory() {
        int i = 0;
        Node root = new Node("First " + i, "Last " + i);
        System.out.println(root.toString());
        Node aux = root;
        while (true) {
            i++;
            aux.setNext(new Node("First " + i, "Last " + i));
            aux = aux.getNext();
            if (i % 10000 == 0) {
                System.out.println();
                System.out.println("Created node # " + i);
                displayMemory();
            }
        }
    }

    private static long convertToMb(long totalBytes) {
        return totalBytes / 1024 / 1024;
    }

    private static void displayMemory() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory (Mb): " + convertToMb(runtime.totalMemory()));
        System.out.println("Free Memory (Mb) : " + convertToMb(runtime.freeMemory()));
        System.out.println("Used Memory (Mb) : " + convertToMb(runtime.totalMemory() - runtime.freeMemory()));
    }

    public static void main(String[] args) {
        displayMemory();

        FillHeapMemory fillHeapMemory = new FillHeapMemory();
        fillHeapMemory.fillMemory();
    }

}

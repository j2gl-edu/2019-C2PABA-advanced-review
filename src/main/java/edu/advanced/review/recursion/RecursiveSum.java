package edu.advanced.review.recursion;

public class RecursiveSum {


    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return 1 + sum(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int resultado = sum(3,5);
        System.out.println("Resutlado = " + resultado);
    }

}

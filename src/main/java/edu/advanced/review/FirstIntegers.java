package edu.advanced.review;

public class FirstIntegers {

    public static int sumFirstIntegers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumFirstIntegers(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sumFirstIntegers(3);
        System.out.println("Result = " + result);
    }

}

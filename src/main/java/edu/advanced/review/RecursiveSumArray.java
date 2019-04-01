package edu.advanced.review;

public class RecursiveSumArray {


    private static int sumArray(int[] numbers, int n) {
        if (n == 1) {
            return numbers[0];
        } else {
            return numbers[n - 1] + sumArray(numbers, n - 1);
        }
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 5};
        int result = sumArray(numbers, numbers.length);
        System.out.println("Result = " + result);
    }

}

package com.twu.senchen;

public class FizzBuzzExercise {
    public static void main(String[] args) {
        int num = 100;
        fizzbuzz(num);
    }

    private static void fizzbuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.println();
            }
        }
    }
}

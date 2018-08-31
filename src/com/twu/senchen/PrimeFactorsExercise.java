package com.twu.senchen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(getPrimeFactor(num));
    }

    private static List<Integer> getPrimeFactor(int num) {
        List<Integer> list = new ArrayList<>();

        if(num < 2) {
            return list;
        }

        for(int i=2; i<=num; i++) {
            if(num % i == 0) {
                num /= i;
                list.add(i);
            }
        }

        return list;
    }
}

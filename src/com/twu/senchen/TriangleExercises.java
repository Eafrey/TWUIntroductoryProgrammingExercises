package com.twu.senchen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("horizontal line");
        drwaHorizontalLine(num);
        System.out.println("vertical line");
        drwaVerticleLine(num);
        System.out.println("right triangle");
        drwaRightTriangle(num);
    }

    private static void drwaRightTriangle(int num) {
        for(int i=0; i<num; i++) {
            drwaHorizontalLine(i+1);
        }
    }

    private static void drwaHorizontalLine(int count) {
        String str = "";
        for(int i=0; i<count; i++) {
            str += "*";
        }
        System.out.println(str);
    }

    private static void drwaVerticleLine(int count) {
        String str = "";
        for(int i=0; i<count; i++) {
            System.out.println("*");
        }
    }
}

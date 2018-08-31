package com.twu.senchen;

import java.util.Scanner;

public class DiamondExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String name = scanner.next();

        System.out.println("drawIsoscelesTriangle");
        drawIsoscelesTriangle(num);
        drwaHorizontalLine(num * 2 - 1);

        System.out.println("drawDimond");
        drawDimond(num);

        System.out.println("drawDimondWithName");
        drawDimondWithName(num, name);
    }

    private static void drawDimond(int num) {
        drawIsoscelesTriangle(num);
        drwaHorizontalLine(num * 2 - 1);
        drawReverseIsoscelesTriangle(num);
    }

    private static void drawDimondWithName(int num, String name) {
        drawIsoscelesTriangle(num);
        System.out.println(name);
        drawReverseIsoscelesTriangle(num);
    }


    private static void drwaHorizontalLine(int count) {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += "*";
        }
        System.out.println(str);
    }

    private static void drawIsoscelesTriangle(int num) {
        for (int i = 0; i < num - 1; i++) {
            String line = "";
            for (int j = 0; j < num - i - 1; j++) {
                line += " ";
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                line += "*";
            }
            System.out.println(line);
        }
    }

    private static void drawReverseIsoscelesTriangle(int num) {
        for (int i = num - 2; i >= 0; i--) {
            String line = "";
            for (int j = 0; j < num - i - 1; j++) {
                line += " ";
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                line += "*";
            }
            System.out.println(line);
        }
    }
}

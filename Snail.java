package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int progress = a - b;
        int day = 1;
        if (a >= h) {
            System.out.println(day);
        } else if (progress > 0) {
            while (true) {
                progress += a;
                ++day;
                if (progress < h) {
                    progress -= b;
                } else {
                    break;
                }
            }
            System.out.println(day);
        } else {
            System.out.println("Impossible");
        }
    }
}

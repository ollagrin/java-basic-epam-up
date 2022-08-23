package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (scanner.hasNext()) {
            int next = scanner.nextInt();
            if (next != 0) {
                sum += next;
                ++number;
            } else {
                break;
            }
        }
        System.out.println(sum / number);
    }

}
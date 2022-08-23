package com.epam.rd.autotasks.sequence;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int nextValue;
        while (scanner.hasNext()) {
            nextValue = scanner.nextInt();
            if (nextValue != 0) {
                if (nextValue > max) {
                    max = nextValue;
                }
            } else {
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}

package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        if (array == null) {
            return 0;
        } else {
            int sum = 0;
            for (int elem : array) {
                if (elem % 2 == 0) {
                    sum += elem;
                }
            }
            return sum;
        }
    }
}

package com.epam.rd.autotasks.max;

import java.util.Arrays;

public class MaxMethod {
    public static int max(int[] values) {
        ///throw new UnsupportedOperationException();
        return Arrays.stream(values).max().orElse(-1);
    }
}

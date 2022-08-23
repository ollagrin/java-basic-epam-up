package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] arr = new int[rows][columns];
        //int value = 0;
        int value = 1;
        int fromOne = 1;
        int fromZero = 0;
        int maxRow = arr.length - 1;
        int maxColumn = arr[0].length - 1;
        while (value <= rows * columns) {
            for (int j = fromZero; j < maxColumn + 1; ++j) {
                arr[fromZero][j] = value;
                ++value;
            }
            if(value > rows * columns){
                break;
            }
            for (int i = fromOne; i < maxRow + 1; ++i) {
                arr[i][maxColumn] = value;
                ++value;
            }
            if(value > rows * columns){
                break;
            }
            --maxColumn;
            for (int j = maxColumn; j >= fromZero; --j) {
                arr[maxRow][j] = value;
                ++value;
            }
            if(value > rows * columns){
                break;
            }
            --maxRow;
            for(int i = maxRow; i >= fromOne; --i){
                arr[i][fromZero] = value;
                ++value;
            }
            ++fromOne;
            ++fromZero;
        }
        return arr;
    }
}

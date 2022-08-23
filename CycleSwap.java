package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length == 0) {
            array = new int[]{};
        } else {
            int tmpPrev = array[0];
            int tmpNext;
            for (int i = 1; i < array.length; ++i) {
                tmpNext = array[i];
                array[i] = tmpPrev;
                tmpPrev = tmpNext;
            }
            array[0] = tmpPrev;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length == 0) {
            array = new int[]{};
        } else {
            int[] tmp = new int[array.length];
            int iTmp=0;
            for(int i = 0; i < array.length; ++i){
                if(i + shift < array.length){
                    tmp[i + shift] = array[i];
                } else{
                    tmp[iTmp] = array[i];
                    ++iTmp;
                }
            }
            for(int i = 0; i < array.length; ++i){
                array[i] = tmp[i];
            }
        }
    }
}

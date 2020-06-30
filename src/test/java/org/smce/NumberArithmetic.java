package org.smce;

public class NumberArithmetic {
    public int greatestCommonDenominator(int p, int q) {
        int halfOfMax = Math.max(p, q) / 2;
        int maxCommonDenominator = 0;
        for (int i=1; i <= halfOfMax; i++) {
            if (p % i == 0 && q % i ==0) {
                maxCommonDenominator = i;
            }
        }
        return maxCommonDenominator;
    }

    public int greatestCommonDenominatorRecursion(int p, int q) {
        if (q == 0) return p;
        return greatestCommonDenominatorRecursion(q, p % q);
    }

    public void insertSort(int[] array) {
        if (array.length == 1) {
            return;
        }

        for (int j = 1; j < array.length; j ++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public void insertSortDescending(int[] array) {
        if (array.length == 1) {
            return;
        }

        for (int j = 1; j < array.length; j ++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] < key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

}

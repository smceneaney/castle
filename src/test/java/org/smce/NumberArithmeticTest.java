package org.smce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberArithmeticTest {
    @Test
    public void test() {
        NumberArithmetic testClass = new NumberArithmetic();

        int greatestCommonDenominator = testClass.greatestCommonDenominator(12, 18);
        assertEquals(6, greatestCommonDenominator);
    }

    @Test
    public void testRecursion() {
        NumberArithmetic testClass = new NumberArithmetic();

        int greatestCommonDenominator = testClass.greatestCommonDenominatorRecursion(12, 18);
        assertEquals(6, greatestCommonDenominator);
    }

    @Test
    public void insertSort() {
        int[] array = new int[] {10,2,1,8,6,7};
        NumberArithmetic testClass = new NumberArithmetic();

        testClass.insertSort(array);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(6, array[2]);
        assertEquals(7, array[3]);
        assertEquals(8, array[4]);
        assertEquals(10, array[5]);
    }

    @Test
    public void insertSortDescending() {
        int[] array = new int[] {10,2,1,8,6,7};
        NumberArithmetic testClass = new NumberArithmetic();

        testClass.insertSortDescending(array);
        assertEquals(10, array[0]);
        assertEquals(8, array[1]);
        assertEquals(7, array[2]);
        assertEquals(6, array[3]);
        assertEquals(2, array[4]);
        assertEquals(1, array[5]);
    }

}
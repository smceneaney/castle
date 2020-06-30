package org.smce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayArithmeticTest {

    @Test
    public void test() {
        int[] inputArray = {1,2,5,4,3};

        ArrayArithmetic testClass = new ArrayArithmetic();

        int[] resultArray = testClass.addOneToArray(inputArray);

        assertEquals(5, resultArray.length);
        assertEquals(1, resultArray[0]);
        assertEquals(2, resultArray[1]);
        assertEquals(5, resultArray[2]);
        assertEquals(4, resultArray[3]);
        assertEquals(4, resultArray[4]);

    }

    @Test
    public void testAllNines() {
        int[] inputArray = {9,9,9,9,9};

        ArrayArithmetic testClass = new ArrayArithmetic();

        int[] resultArray = testClass.addOneToArray(inputArray);

        assertEquals(6, resultArray.length);
        assertEquals(1, resultArray[0]);
        assertEquals(0, resultArray[1]);
        assertEquals(0, resultArray[2]);
        assertEquals(0, resultArray[3]);
        assertEquals(0, resultArray[4]);
        assertEquals(0, resultArray[5]);

    }

    @Test
    public void testReverseString() {
        String name = "Shane McEneaney";

        ArrayArithmetic testClass = new ArrayArithmetic();

        String reverseString = testClass.reverseString(name);

        assertEquals("yenaenEcM enahS", reverseString);
    }

    @Test
    public void testFibonacciSequence() {
        ArrayArithmetic testClass = new ArrayArithmetic();
        testClass.printFibonacciSequence(6);

    }

    @Test
    public void testFibonacci() {
        ArrayArithmetic testClass = new ArrayArithmetic();
        int result = testClass.fibonacci(6);
        Assertions.assertEquals(13, result);

    }

    @Test
    public void testHop() {
        ArrayArithmetic testClass = new ArrayArithmetic();
        boolean result = testClass.startHopping();
        Assertions.assertTrue(result);

    }
}
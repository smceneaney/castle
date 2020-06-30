package org.smce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

class SorterTest {
    private static final Logger logger = LogManager.getLogger(SorterTest.class);

    @Test
    public void testQuickSort() {
        int[] integerArray = {10,80,30,90,40,50,70};

        logger.info("Before: "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

        Sorter sorter = new Sorter();
        sorter.quickSort(integerArray, 0, 6);
        logger.info("After:  "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

    }

    @Test
    public void testQuickSort2() {
        int[] integerArray = {10,8,1,2,5,7,3,4};

        logger.info("Before: "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

        Sorter sorter = new Sorter();
        sorter.quickSort(integerArray, 0, integerArray.length - 1);
        logger.info("After:  "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

    }

    @Test
    public void testQuickSortAllEqual() {
        int[] integerArray = {7,7,7,7,7,7,7,7};

        logger.info("Before: "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

        Sorter sorter = new Sorter();
        sorter.quickSort(integerArray, 0, integerArray.length - 1);
        logger.info("After:  "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

    }

    @Test
    public void testSelectionSort() {
        int[] integerArray = {10,80,30,90,40,50,70};

        logger.info("Before: "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

        Sorter sorter = new Sorter();
        sorter.selectionSort(integerArray);
        logger.info("After:  "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

    }

    @Test
    public void testMergeSort() {
        int[] integerArray = {10,80,30,90,40,50,70};

        logger.info("Before: "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

        Sorter sorter = new Sorter();
        sorter.mergeSort(integerArray);
        logger.info("After:  "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));

        String test = "testString";
        test.substring(0, 0);
    }

}
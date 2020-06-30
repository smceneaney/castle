package org.smce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorter {

    private static Logger logger = LogManager.getLogger(Sorter.class);

    public void selectionSort(int[] integerArray) {
        for (int i=0; i < integerArray.length; i++) {
            int minValueIndex = i;
            int minValue = Integer.MAX_VALUE;
            for (int j = i; j < integerArray.length; j++) {
                if (integerArray[j] < minValue) {
                    minValue = integerArray[j];
                    minValueIndex = j;
                }
            }
            swap(integerArray, i, minValueIndex);
        }
    }

    public int[] mergeSort(int[] integerArray) {
        if (integerArray.length <= 1) {
            return integerArray;
        }
        int midPoint = integerArray.length / 2;
        int[] integerArrayLeft = new int[midPoint];
        for (int i = 0; i < midPoint; i++) {
            integerArrayLeft[i] = integerArray[i];
        }
        int[] integerArrayRight = new int[integerArray.length - midPoint];
        for (int i=midPoint; i < integerArray.length; i++) {
            integerArrayRight[i-midPoint] = integerArray [i];
        }
        int[] sortedLeft = mergeSort(integerArrayLeft);
        int[] sortedRight = mergeSort(integerArrayRight);

        return merge(integerArray, sortedLeft, sortedRight);
    }

    private int[] merge(int[] originalArray, int[] sortedLeft, int[] sortedRight) {
        int i=0;
        int j=0;
        int k=0;
        while (i < sortedLeft.length && j < sortedRight.length) {
            if (sortedLeft[i] < sortedRight[j]) {
                originalArray[k++] = sortedLeft[i++];
            } else {
                originalArray[k++] = sortedRight[j++];
            }
        }
        while (i < sortedLeft.length) {
            originalArray[k++] = sortedLeft[i++];
        }
        while (j < sortedRight.length) {
            originalArray[k++] = sortedRight[j++];
        }
        return originalArray;
    }


    public void quickSort(int[] integerArray, int low, int high) {
        logger.info("low="+low+", high="+high);
        if (low < high) {
            int partitioningIndex = partition(integerArray, low, high);

            quickSort(integerArray, low, partitioningIndex - 1);
            quickSort(integerArray, partitioningIndex + 1, high);
        }
    }

    private int partition(int[] integerArray, int low, int high) {
        int i = low;
        int pivotValue = integerArray[high];
        logger.info("low="+low+", high="+high+", pivotValue="+pivotValue);
        for ( int j=low ; j < high; j++) {
            if (integerArray[j] < pivotValue) {
                swap(integerArray, i, j);
                logger.info("i="+i+", j="+j+" - "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));
                i++;
            } else {
                logger.info("i="+i+", j="+j+" - none");
            }
        }
        swap(integerArray, i, high);
        logger.info("returning i="+i+" - "+ Arrays.stream(integerArray).mapToObj(String::valueOf).collect(Collectors.toList()));
        return i;

    }

    private void swap(int[] integerArray, int i, int j) {
        int temp = integerArray[i];
        integerArray[i] = integerArray[j];
        integerArray[j] = temp;
    }
}

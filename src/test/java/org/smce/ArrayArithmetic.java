package org.smce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayArithmetic {

    private static Logger logger = LogManager.getLogger(ArrayArithmetic.class);

    public int[] addOneToArray(int[] numberArray) {
        if (numberArray.length == 0) {
            return new int[0];
        }
        boolean carryOver = false;
        List<Integer> resultArrayInReverseOrder = new ArrayList<>();
        for (int i = numberArray.length - 1 ; i >= 0; i--) {
            if (i == numberArray.length - 1 || carryOver) {
                carryOver = numberArray[i] == 9;
                resultArrayInReverseOrder.add(carryOver ? 0 : numberArray[i] + 1);
            } else {
                resultArrayInReverseOrder.add(numberArray[i]);
            }
        }
        if (carryOver) {
            resultArrayInReverseOrder.add(1);
        }
        int[] resultArray = new int[resultArrayInReverseOrder.size()];
        int i = resultArrayInReverseOrder.size();
        for (Integer integer : resultArrayInReverseOrder) {
            resultArray[--i] = integer;
        }
        return resultArray;

    }

    public String reverseString(String originalString) {
        if (originalString.length() == 0) {
            return originalString;
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = originalString.length()  - 1; i >= 0; i--) {
            reverseString.append(originalString.toCharArray()[i]);
        }
        return reverseString.toString();
    }

    public void printFibonacciSequence(int n) {
        int last = 1;
        int current = 2;
        logger.info(last);
        logger.info(current);
        for (int i = current ; i < n ; i++) {
            int temp = current;
            current = current + last;
            logger.info(current);
            last = temp;
        }
    }

    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }

    public boolean startHopping() {
        int island = 17;
        boolean hopSuccessful = hop(0, 2, island) || hop(0, 2, island);
        logger.info(hopSuccessful);
        return hopSuccessful;
    }

    private boolean hop(int stoneNumber, int hopCount, final int island) {
        int newStoneNumber = stoneNumber + hopCount;
        if (newStoneNumber == island) {
            return true;
        }
        if (newStoneNumber > island) {
            return false;
        }

        return hop(newStoneNumber, 2, island) || hop(newStoneNumber, 3, island);
    }

}

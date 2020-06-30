package org.smce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringAlgorithms {
    private static Logger logger = LogManager.getLogger(StringAlgorithms.class);

    void permutationBook(String string) {
        permutationBook(string, "");
    }

    private void permutationBook(String string, String prefix) {
        if (string.length() == 0) {
            logger.info(prefix);
        }
        for (int i=0; i < string.length();i++) {
            String rem = string.substring(0, i) +string.substring(i+1);
            permutationBook(rem, prefix + string.charAt(i));
        }
    }

    public void permutationWeb(String string, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            logger.info(string);
            return;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            string = swap(string, startIndex, i);
            permutationWeb(string, startIndex + 1, endIndex);
            // backtrack
            string = swap(string, startIndex, i);
        }
    }

    public void stringPermutations(String string, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            logger.info(string);
            return;
        }
        for (int i = startIndex ; i <= endIndex ; i++) {
            string = swap(string, startIndex , i);
            stringPermutations(string, startIndex + 1, endIndex);
            string = swap(string, startIndex , i);
        }
    }

    private String swap(String string, int i, int j) {
        char[] stringCharacterArray = string.toCharArray();
        char temp = stringCharacterArray[i];
        stringCharacterArray[i] = stringCharacterArray[j];
        stringCharacterArray[j] = temp;
        return String.valueOf(stringCharacterArray);
    }
}

package org.smce;

import org.junit.jupiter.api.Test;

class StringAlgorithmsTest {

    @Test
    public void test() {
        String string = "ted";

        StringAlgorithms testClass = new StringAlgorithms();

        testClass.permutationBook(string);
    }

    @Test
    public void testWebSolution() {
        String string = "ABC";

        StringAlgorithms testClass = new StringAlgorithms();

        testClass.stringPermutations(string, 0, string.length()-1);
    }




}
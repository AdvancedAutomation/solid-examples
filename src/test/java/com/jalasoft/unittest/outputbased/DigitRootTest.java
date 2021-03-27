package com.jalasoft.unittest.outputbased;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitRootTest {

    @Test
    public void testDigitalRootSingleNumber() {
        final int number = 2;

        int actualResult = DigitRoot.digitalRoot(number);

        final int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitalRootTwoNumbers() {
        final int number = 16;

        int actualResult = DigitRoot.digitalRoot(number);

        final int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitalRootSixNumbers() {
        final int number = 132189;

        int actualResult = DigitRoot.digitalRoot(number);

        final int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

}

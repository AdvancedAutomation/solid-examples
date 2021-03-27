package com.jalasoft.unittest.outputbased;

/**
 * Kata Digit Root.
 *
 * https://www.codewars.com/kata/541c8630095125aba6000c00/java
 */
public final class DigitRoot {

    private DigitRoot() {
    }

    public static final int THRESHOLD = 10;

    public static int digitalRoot(int number) {
        if (number < THRESHOLD) {
            return number;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % THRESHOLD;
            number /= THRESHOLD;
        }
        return digitalRoot(sum);
    }
}

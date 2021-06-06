package com.jalasoft.yesica.unittest;

import java.util.Arrays;

public class ReducingDishes {

    public int maxSatisfaction(final int[] satisfaction) {
        Arrays.sort(satisfaction);
        int maxSatisfaction = 0;
        int prefixSum = 0;
        int current = 0;
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            current += prefixSum + satisfaction[i];
            prefixSum += satisfaction[i];
            maxSatisfaction = Math.max(current, maxSatisfaction);
            if (prefixSum <= 0) {
                break;
            }
        }
        return maxSatisfaction;
    }
}

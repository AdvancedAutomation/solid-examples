package com.jalasoft.yesica.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ReducingDishesTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"dishes to be removed", new int[] {-1, -8, 0, 5, -9}, 14},
                {"dishes to be reordered", new int[] {4, 3, 2}, 20},
                {"dishes nobody likes", new int[] {-1, -4, -5}, 0},
                {"mixed dishes", new int[] {-2, 5, -1, 0, 3, -3}, 35},
                {"no values", new int[] {}, 0}
        });
    }

    private final String satisfactionType;
    private final int[] satisfaction;
    private final int expectedMaxSatisfaction;


    public ReducingDishesTest(final String satisfactionType, final int[] satisfaction, int expectedMaxSatisfaction) {
        this.satisfactionType = satisfactionType;
        this.satisfaction = satisfaction;
        this.expectedMaxSatisfaction = expectedMaxSatisfaction;
    }

    @Test
    public void testMaxSatisfaction() {

        int maxSatisfaction = new ReducingDishes().maxSatisfaction(satisfaction);

        assertEquals(String.format("The maximum sum of Like-time coefficient for a satisfaction with %s "
                + "was not the expected", satisfactionType), expectedMaxSatisfaction, maxSatisfaction);
    }
}

package com.jalasoft.unittest.communicationbased;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceImplTest {

    private static final double DELTA = 0.001;

    @Mock
    private DataService dataService;

    @InjectMocks
    private CalculatorServiceImpl calculatorService;

    @Test
    public void testCalculateAverageEmptyListOfNumbers() {
        when(dataService.getListOfNumbers()).thenReturn(new int[] {});

        double actualAverage = calculatorService.calculateAverage();

        final double expectedAverage = 0;
        assertEquals(expectedAverage, actualAverage, DELTA);
    }

    @Test
    public void testCalculateAverageWithListOfNumbers() {
        final int[] numbers = {5, 3, 2, 2};
        when(dataService.getListOfNumbers()).thenReturn(numbers);

        double actualAverage = calculatorService.calculateAverage();

        final double expectedAverage = 3;
        assertEquals(expectedAverage, actualAverage, DELTA);
    }

}

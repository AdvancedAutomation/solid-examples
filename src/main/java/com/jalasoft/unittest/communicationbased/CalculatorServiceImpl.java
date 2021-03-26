package com.jalasoft.unittest.communicationbased;

public class CalculatorServiceImpl implements CalculatorService {

    private DataService dataService;

    @Override
    public double calculateAverage() {
        int[] numbers = dataService.getListOfNumbers();
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        return (numbers.length > 0) ? average / numbers.length : 0;
    }

    public void setDataService(final DataService dataService) {
        this.dataService = dataService;
    }

}

package org.calc;

import java.util.ArrayList;

public class Multiplication {

    private ArrayList<Double> numbers = new ArrayList<>();

    public void addNumber(double number) {
        numbers.add(number);
    }

    public double execute() {
        double result = 1;
        for(double number : numbers) {
            result *= number;
        }
        return result;
    }

}

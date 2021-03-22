package org.calc;

public class Root {
    private double number1;
    private double number2;
    private double result;

    public Root(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void run() {
        result = Math.pow(number2, 1.0 / number1);
    }

    public double getResult() {
        return result;
    }
}

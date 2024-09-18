package org.sgp.calc.operators;

public class Calculator implements Calculation {
    @Override
    public double addition(double num1, double num2) {
        return num1+num2;
    }
    @Override
    public double subtraction(double num1, double num2) {
        return num1-num2;
    }
    @Override
    public double multiplication(double num1, double num2) {
        return num1*num2;
    }
    @Override
    public double division(double num1, double num2) {
        return num1/num2;
    }
    @Override
    public double toPower(double num1, double num2){
        double result = 1;
        while (num2 != 0) {
            result *= num1;
            --num2;
        }
    return result;
    }
}

package org.sgp.calc.operators;

public interface Calculation {
    double addition(double firstNum, double secondNum);
    double subtraction(double firstNum, double secondNum);
    double multiplication(double firstNum, double secondNum);
    double division(double firstNum, double secondNum);
    double toPower(double firstNum, double secondNum);
}

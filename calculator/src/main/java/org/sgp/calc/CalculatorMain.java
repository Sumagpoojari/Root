package org.sgp.calc;
import org.sgp.calc.operators.Calculation;
import org.sgp.calc.operators.Calculator;
import java.util.Scanner;
import static java.lang.System.*;

public class CalculatorMain {

    private static Calculation calculator;
    static {
        calculator = new Calculator();
    }

    public static void main(String[] args) {

        //System.out.println("Welcome to Java Calculator Application");

        Scanner sc = new Scanner(in);

        out.println("Enter the Number : ");
        double num1 = sc.nextDouble();
        sc.nextLine();
        out.println("Enter the operator : ");
        String inputOp = sc.nextLine();
        out.println("Enter the num2 : ");
        double num2 = sc.nextDouble();

        double result = processInput(num1, inputOp, num2);
        out.println("The result of the operation is : " + result);

        sc.close();
        System.exit(0);

        }

        public static double processInput( double num1, String input,double num2) {

            double result = switch (input) {
                case "+" -> calculator.addition(num1, num2);
                case "-" -> calculator.subtraction(num1, num2);
                case "*" -> calculator.multiplication(num1, num2);
                case "/" -> calculator.division(num1, num2);
                case "^" -> calculator.toPower(num1,num2);
                default -> 0;
            };

            return result;
    }

}

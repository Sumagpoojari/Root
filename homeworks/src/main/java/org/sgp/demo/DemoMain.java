package org.sgp.demo;

import org.sgp.demo.demos.CalculatePercentage;
import org.sgp.demo.demos.OddEven;
import org.sgp.demo.demos.PrimeAndFactorial;
import org.sgp.demo.demos.Tables;

public class DemoMain {
    public  static void main(String [] args){
        //tables
        Tables tab = new Tables(2);
        tab.tables();

        //checking odd or even
        OddEven num1 = new OddEven(37);
        num1.checkNumber();

        OddEven num2 = new OddEven(0);
        num2.checkNumber();

        //Listing odd numbers under 100
        OddEven listodds = new OddEven(100);
        listodds.listOutOdds();

        //Finding prime number and factorial
        PrimeAndFactorial isprime = new PrimeAndFactorial(11);
        isprime.findPrime();
        isprime.findFactorial();

        //find percentage of marks
        CalculatePercentage std1Percent = new CalculatePercentage(498);
        std1Percent.marksPercentage();

    }
}

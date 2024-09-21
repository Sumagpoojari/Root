package org.sgp.demo.demos;

public class PrimeAndFactorial {
    private int checkNum;
    public PrimeAndFactorial(int num){
        this.checkNum=num;
    }

    public void findPrime(){
        for (int i=2;i<checkNum;i++){
            if(checkNum%i==0){
                System.out.println("\n"+checkNum+" is not a prime number");
                break;
            }else {
                System.out.println("\n"+checkNum+" is a prime number");
                break;
            }
        }
    }

    public void findFactorial(){
        int i=1,result = 1;
        while (i<=checkNum){
            result *= i;
            i++;
        }
        System.out.println("factorial of "+checkNum+" is "+result);
    }
}

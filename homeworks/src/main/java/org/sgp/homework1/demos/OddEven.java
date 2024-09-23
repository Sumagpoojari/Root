package org.sgp.homework1.demos;

public class OddEven {

    //to check a number is odd or even
    private int checkNum;
    public OddEven(int num){
        this.checkNum=num;
    }

    public void checkNumber(){
        if(checkNum<=0){
            System.out.println("Enter a positive integer");
        } else if (checkNum%2==0) {
            System.out.println("It is an Even number");
        } else {
            System.out.println("It is an Odd number");
        }
    }

    public void listOutOdds(){
        for(int i=1; i<=checkNum;i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }

}

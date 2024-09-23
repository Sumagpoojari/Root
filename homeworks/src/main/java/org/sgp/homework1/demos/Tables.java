package org.sgp.homework1.demos;

import org.sgp.homework1.DemoLog;

public class Tables implements DemoLog {
    //tables for a number
    private final int num ;
    public Tables(int num){
        this.num = num;
    }

    @Override
    public void tables(){
        int result = 1;
        for(int i=1; i<=10; i++){
            result = i*num;
            System.out.println(num+" * "+i+" = "+result);
        }    }

}

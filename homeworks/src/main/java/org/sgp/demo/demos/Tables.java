package org.sgp.demo.demos;

import org.sgp.demo.DemoLog;

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

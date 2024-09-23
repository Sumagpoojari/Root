package org.sgp.homework1.demos;

public class CalculatePercentage {
    private int marksearned;
    private int totalmarks=600;
    private float percentage;

    public CalculatePercentage(int marks){
        marksearned=marks;
    }
    public int getMarksearned(){
        return marksearned;
    }
    public void marksPercentage(){
        percentage = (float) marksearned /totalmarks*100;
        System.out.println("Total percentage is "+percentage);
    }
}

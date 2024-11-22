package com.company;

public class Main {

    public static void main(String[] args) {

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float minimum value =" + myFloatMinValue);
        System.out.println("Float maximum value =" + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =" + myDoubleMinValue);
        System.out.println("Double maximum value =" + myDoubleMaxValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double myPoundValue = 5.15d;
        double myKgValue = myPoundValue * 0.45359237;
        System.out.println("My Kg Value is = " + myKgValue);



    }
}

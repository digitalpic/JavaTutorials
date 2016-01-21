package com.shawnconrad;

public class Main {

    public static void main(String[] args) {
        // FOUR DATA TYPES THAT DEAL WITH WHOLE NUMBERS

        //integer has a width of 32
	    int myMinValue = 50;

        //byte has a width of 8
        byte myByteValue = 10;


        //short has a width of 16
        short myShortValue = 20;


        //long has width of 64
        long myLongValue = 50000L + 10L * (myByteValue +  myShortValue  +  myMinValue);
        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myMinValue));
        System.out.println("myLongValue =" + myLongValue);
        System.out.println("shortTotal =" + shortTotal);

    }
}

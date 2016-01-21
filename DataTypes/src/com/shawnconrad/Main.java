package com.shawnconrad;

public class Main {

    public static void main(String[] args) {
	    // 8 PRIMITIVE TYPES
            // byte
            // short
            // int
            // long
            // float
            // double
            // char
            // boolean

        // 9 DATA TYPE
            // string
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2016";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        // Default operations for string to teat as strings only
        System.out.println("The result is " + numberString);

        // Still treated as text
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);

    }
}

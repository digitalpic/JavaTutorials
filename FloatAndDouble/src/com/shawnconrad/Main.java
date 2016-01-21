package com.shawnconrad;

public class Main {
        // Float and Double give the remainder as it deals with decimal values
    public static void main(String[] args) {
	    int myIntValue = 5 / 2;
        // width of float is 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double is 64 (8 bytes) more precise. Faster on modern computers. Recommend using.
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatVlaue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms.
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // 90.7185
    }
}

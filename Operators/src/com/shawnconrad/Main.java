package com.shawnconrad;

public class Main {

    public static void main(String[] args) {
	    // Operators =, +, -, /, % (remainder),
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " -1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println( "Result is now " + result);
        // Add one to count result
        result ++;
        System.out.println( "Result is now " + result);
        // Subtract one from count
        result --;
        System.out.println( "Result is now " + result);
        // Adds two to the count
        result += 2;
        System.out.println( "Result is now " + result);
        // Multiply 10
        result *= 10;
        System.out.println( "Result is now " + result);
        result -= 10;
        System.out.println( "Result is now " + result);
        result /= 10;
        System.out.println( "Result is now " + result);



        // Assignment operator set value to false. Conditional code.
        boolean isAlien = false;
        // Testing to see if value is false.
        if (isAlien == true)
            System.out.println("It is not an alien.");
        // Have to be true
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You've got the top score");
        //
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score, and less than 100.");

    }
}

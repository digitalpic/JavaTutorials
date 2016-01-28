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
        if (    isAlien == false)
            System.out.println("It is not an alien.");
        // Has to be true
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You've got the top score");
        // && must be true compare AND
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score, and less than 100.");
        // OR ||
        if ((topScore >90) || (secondTopScore <=90))
        System.out.println("One of these test is true");

        int newValue = 50;
        // One equal '=' means setting value.
        if (newValue == 50)
            System.out.println("This is true!");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not suppose to happen");

        // Turnery operator (shortcut)
        isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar is true");

        // 1. Create a double variable with a value of 20
        // 2. Create a second variable  of type double with a value of 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays the message, "Total was over the limit".
        //    if the remainder total (#4) is equal to 20 or less.

        // PROPER ANSWER
        double myFirstValue = 20d;
        double mySecondValue = 80;
        // Precedence. Calculate in brackets first.
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is "  + theRemainder);
        if(theRemainder <=20)
            System.out.println("Total was over the limit.");


        // My initial answer
        int newResult = 20 + 80;
        System.out.println("20 + 80 = " + newResult);

        int prevResult = newResult;

        newResult = newResult * 25;
        System.out.println(prevResult + " * 25 = " + newResult);

        prevResult = newResult;

        newResult = newResult % 40;
        System.out.println(prevResult + " Remainder = " + newResult);

        if (newResult <= 20)
            System.out.println("Total was over the limit.");


    }
}

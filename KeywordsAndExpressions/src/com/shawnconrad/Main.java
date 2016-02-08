package com.shawnconrad;

public class Main {

    public static void main(String[] args) {
        // Expressions are built with values methods and operators. Also method calls.
        // Ex. Mile = 1.609344 Kilometers
        // kilometers = 100 * 1.609344 is the EXPRESSION. Expression components are variables, values and operators.
        // Braces and bracket do not form part of an expression.
        // Indentation to make it more readable.
        double kilometers = (100 * 1.609344);
        int highScore = 50; // This is a Statement
        myVariable++; // Statement
        myVariable--; // Statement


        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // In the following code, write down what parts of the code are expressions.
        int score = 100; //Expression: score = 100
        if (score > 90) {
            System.out.println("You got the high score!"); // Expression: You got the high score!
            score = 0; // Expression: score = 0
        }
    }
}

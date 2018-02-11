/*
Practice Exercise from Exercises for Programmers: 57 Challenges to Develop
Your Coding Skills, with all challenges.
Started: 2 March 2017
 */
package OLD;

import java.util.Scanner;

/**
 Driver for program that calculates a tip.

 @version 0.1
 @author Ben Stone
 */
public class TipCalculatorOLD {

    /**
     Rounds up the nearest cent of a monetary value

     @param inMoney Money amount to be rounded
     @return Rounded value
     */
    public static float ceilNearestCent(float inMoney) {
        return (float) (0.01 * Math.ceil(inMoney * 100));
    }

    /**
     Processes input until a positive float is entered

     @param input Scanner to ping for input
     @param varName Name of the variable being assigned return value
     @return Positive Float from user
     */
    public static float inputPosFloat(Scanner input, String varName) {

        // Set up some worker vars
        String inputValueStr = "";
        Float inputValueFloat = 0.0f;

        // Record input into inputValue
        inputValueStr = input.next();

        // Try to convert inputValueStr into a float
        try
        {
            inputValueFloat = Float.parseFloat(inputValueStr);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Please enter a valid number for " + varName);

            // Recurse for acceptable val
            inputValueFloat = inputPosFloat(input, varName);
        }

        // Check if value is negative
        if (inputValueFloat < 0)
        {
            // Ask for a positive value
            System.out.println("Please enter a positive number for " + varName);

            // Recurse for correct val
            inputValueFloat = inputPosFloat(input, varName);

        }

        // Shoot output back
        return inputValueFloat;
    }

    /**
     @param args the command line arguments
     */
    public static void main(String[] args) {

        // Initialize all worker vars to 0
        float _billAmount, _tip, _tipRate, _total = 0;

        // Prompt user for bill amount
        System.out.println("What is the bill amount?");

        // Create Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Record the input into _billAmount
        _billAmount = inputPosFloat(input, "bill amount");

        // Prompt user for tip rate
        System.out.println("What is the tip rate");

        // Record the tip rate into _tipRate
        _tipRate = inputPosFloat(input, "tip rate");

        // Calculate tip
        _tip = _billAmount * (_tipRate / 100);

        // Round up _tip to nearest cent
        _tip = ceilNearestCent(_tip);

        // Calculate total
        _total = _billAmount + _tip;

        // Output _tip
        System.out.printf("Tip: $%.2f \n", _tip);

        // Output _total
        System.out.printf("Total: $%.2f \n", _total);
    }

}
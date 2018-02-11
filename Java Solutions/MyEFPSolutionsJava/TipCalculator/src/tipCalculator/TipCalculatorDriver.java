/*
Practice Exercise from Exercises for Programmers: 57 Challenges to Develop
Your Coding Skills, with all challenges.
Started: 2 March 2017
 */
package tipCalculator;

import javax.swing.JFrame;

/**
 Driver for program that calculates a tip.

 @version 0.1
 @author Ben Stone
 */
public class TipCalculatorDriver {

    /**
     @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create the frame
        JFrame mainFrame = new TipCalculatorFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }

}

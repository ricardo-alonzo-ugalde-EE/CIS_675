
/**
    Ricardo Alonzo Ugalde
    CIS 675 Design and Analysis of Algorithms
    Spring 2021
    Homework 1
    Problem 1
 */

import java.util.ArrayList;

public class HW1_P1 {
    public static void main(String[] args) {
        System.out.println("results for 10: ");
        giveResults(10);
        System.out.println("results for 100: ");
        giveResults(100);
        System.out.println("results for 1000: ");
        giveResults(1000);
        System.out.println("results for 10000: ");
        giveResults(10000);

    }

    public static void giveResults(int arraySize) {
        // start time
        long millis_startTime = System.currentTimeMillis();

        ArrayList results = new ArrayList();

        // Loop through all possible values of b < arraySize
        for (int b = 0; b < arraySize; b++) {
            // Loop through all possible values of a < arraySize
            for (int a = 0; a < b; a++) {
                // Calculate the results of (a^2 + b^2 + 1)/(ab)
                double doMaths = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);
                // Cast the results to an Integer and check if they are equivalent
                if (doMaths == (int) doMaths) {
                    results.add("[" + a + "," + b + "]");
                }
            }
        }
        // entime
        long millis_endTime = System.currentTimeMillis();

        // interger pair results
        System.out.println("results: " + results);
        // Print the time taken by subtracting the end-time from the start-time
        System.out.println("Time taken in milli seconds: " + (millis_endTime - millis_startTime));
    }

}

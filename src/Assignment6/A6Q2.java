/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author macdn5071
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner for input
        Scanner input = new Scanner(System.in);

        // ask for the number of students
        System.out.println("How many people to measure?");
        // storing the student number
        int people = input.nextInt();
        //need any number of spots

        // create an array to store people
        double[] height = new double[people];

        // use a loop to get all the info
        for (int i = 0; i < people; i++) {
            // asking for a height
            System.out.println("Please enter your height in centimetres:");
            // storing the height
            height[i] = input.nextInt();
        }

        // got all the heights, now average them
        // start at 0
        double total = 0;
        // go through each height
        for (int i = 0; i < people; i++) {
            // add expense to total
            total = total + height[i];
        }
        // calculate the average
        int above = 0;
        double average = (double) (total / people);
        // go through each height and compare to the average
        for (int i = 0; i < people; i++) {
            // if there is someone above the average, add them
            if(height[i] >= average){
                above = above +  1;
            }
        }

        // tell the user how many are above average
        System.out.println("There are " + above + " people above the average of " + average + ".");
    }
}

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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner for input
        Scanner input = new Scanner(System.in);

        
        // ask for the number of students
        System.out.println("How many students in the class?");
        // storing the student number
        int students = input.nextInt();
        //need any number of spots

        // create an array to store name of expenses
        double[] studentMarks = new double[students];

        // use a loop to get all the info
        for (int i = 0; i < students; i++) {
            // asking for a mark
            System.out.println("Enter the marks:");
            // storing the mark
            studentMarks[i] = input.nextInt();
        }
        
        // got all the marks, add them up
        // start at 0
        double total = 0;
        // go through each mark
        for (int i = 0; i < students; i++) {
            // add expense to total
            total = total + studentMarks[i];
        }

        // calculate the average
        double average = (double) Math.ceil(total / students);
        // tell the user what the average is
        System.out.println("The class average is " + average + "%");
        
    }
}

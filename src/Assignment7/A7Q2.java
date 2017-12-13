/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author macdn5071
 */
public class A7Q2 {

    public void mark(String grade, int number) {
        if (number >= 80) {
            System.out.println("The letter grade is an A.");
        }
        if (number <= 49) {
            System.out.println("The letter grade is an F.");
        }
        if (number >= 50) {
            if (number <= 59) {
                System.out.println("The letter grade is a D.");
            }
        }
        if (number >= 60) {
            if (number <= 69) {
                System.out.println("The letter grade is a C.");
            }
        }
        if (number >= 70) {
            if (number <= 79) {
                System.out.println("The letter grade is a B.");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object to run my methods
        A7Q2 test = new A7Q2();

        // Create a scanner
        Scanner in = new Scanner(System.in);
        String grade = new String();

        // ask user for the mark
        System.out.println("Please enter the mark percentage:");
        // store their mark
        int number = in.nextInt();
        // say the mark
        test.mark(grade, number);
    }
}

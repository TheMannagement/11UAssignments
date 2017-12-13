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
public class A7Q5 {

    public void dots(int answer) {
        if (answer == 5) {
            System.out.println("*****");
        }
        if (answer == 4) {
            System.out.println("****");
        }
        if (answer == 3) {
            System.out.println("***");
        }
        if (answer == 2) {
            System.out.println("**");
        }
        if (answer == 1) {
            System.out.println("*");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an object to run my methods
        A7Q5 test = new A7Q5();

        System.out.println("Please enter how many lines of dots you want:");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            //calculate area
            int answer = (int) (Math.random() * (5 - 1 + 1)) + 1;
            test.dots(answer);
        }
    }
}

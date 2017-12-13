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
public class A7Q3 {

    public void factors(int numbers) {
        for (int i = 2; i <= numbers; i++) {
            if (numbers % i == 0) {
                if (i != numbers / i) {
                    System.out.println(numbers / i);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object to run my methods
        A7Q3 test = new A7Q3();

        // Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find factors for:");
        // store their number
        int numbers = input.nextInt();

        test.factors(numbers);
        // let the user know their answer


    }
}

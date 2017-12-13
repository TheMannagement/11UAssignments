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
public class A7Q8 {

    public boolean allOddDigits(int number) {
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            number = number / 10;
            if (lastDigit % 2 == 0) {
                return false;
            }
        }

        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Create an object to run my methods
        A7Q8 method = new A7Q8();

        System.out.println("Please enter a number to determine if it consists of all odd or even integers:");
        int number = input.nextInt();
        boolean allOdd = method.allOddDigits(number);

        if (allOdd) {
            System.out.println("This number consists of all odd integers.");
        }
        if (!allOdd) {
            System.out.println("This number contains an even integer!");
        }
    }
}

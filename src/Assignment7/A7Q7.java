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
public class A7Q7 {

    public int firstDigit(int number) {
        while (-9 > number || 9 < number) {
            number = number / 10;
        }
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Create an object to run my methods
        A7Q7 method = new A7Q7();

        System.out.println("Please enter the number you want to find the first digit of:");
        int number = input.nextInt();

        int answer = method.firstDigit(number);
        System.out.println(answer);
    }
}

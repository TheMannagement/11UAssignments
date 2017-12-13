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
public class A7Q6 {

    public int lastDigit(int number) {
        int answer = number % 10;
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Create an object to run my methods
        A7Q6 method = new A7Q6();

        System.out.println("Please enter the number you want to find the last digit of:");
        int number = input.nextInt();
        int answer = method.lastDigit(number);
        System.out.println(answer);
    }
}

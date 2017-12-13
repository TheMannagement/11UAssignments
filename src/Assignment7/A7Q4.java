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
public class A7Q4 {

    public double intrest(double principle, double rate, double years) {
        //calculate area
        double answer = principle * Math.pow((1 + rate), years);
        // send back the answer
        return answer;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object to run my methods
        A7Q4 test = new A7Q4();

        // Create a scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the current account balance:");
        double principle = in.nextDouble();
        System.out.println("Please enter the intrest rate:");
        double rate = in.nextDouble();
        System.out.println("Please enter the number of years:");
        double years = in.nextDouble();

        // calculate area
        double intrest = test.intrest(principle, rate, years);
        // let the user know their answer
        System.out.println("The new balance is $" + intrest + ".");
    }
}

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
public class A7Q1 {

    public double circleArea(double radius) {
        //calculate area
        double answer = 3.1415 * (radius * radius);
        // send back the answer
        return answer;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object to run my methods
        A7Q1 test = new A7Q1();
        // Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of a circle:");
        double record = input.nextDouble();

        // calculate area
        double area = test.circleArea(record);
        // let the user know their answer
        System.out.println("The area is " + area + ".");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author macdn5071
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //check to see if driver is speeding
        System.out.println("Enter the speed limit:");
        double speedLimit = input.nextDouble();
        System.out.println("Enter the recorded speed of the car:");
        double carSpeed = input.nextDouble();

        //get the difference to calculate how big their fine will be
        double diff = carSpeed - speedLimit;

        while (carSpeed >= speedLimit) {
            while (diff <= 20) {
                System.out.println("You are speeding and your fine is $100");
                carSpeed = input.nextDouble();
            }
            while (diff <= 30) {
                System.out.println("You are speeding and your fine is $270");
                carSpeed = input.nextDouble();
            }
            while (diff > 30) {
                System.out.println("You are speeding and your fine is $500");
                carSpeed = input.nextDouble();
            }
        }

        while (carSpeed <= speedLimit) {
            System.out.println("Congrats, you are within the speed limit!");
            carSpeed = input.nextDouble();
        }
    }
}

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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //start scanner
        Scanner input = new Scanner(System.in);
        
        //calculate inches to cm
        System.out.println("Please enter the measurement in inches you wish to convert:");
        double inches = input.nextDouble();
        
        double cm = inches * 2.54;
        
        System.out.println(inches + " is equal to " + cm + "cm");
    }
}

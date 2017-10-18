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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //have user enter numbers
        System.out.println("Please enter 4 numbers on different lines:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        
        //repeat numbers back
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", and " +number4);
        
    }
}

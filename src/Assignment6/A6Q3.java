/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author macdn5071
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int[] realNumber = new int[2];

        for (int i = 0; i < 2; i++) {
            // ask for integers
            System.out.println("Please enter an integer:");
            // storing the integers
            realNumber[i] = input.nextInt();
        }
        //create a place to hold the higher int to move it
        int holding = 0;

        
        //do this twice, with each number
        for (int i = 0; i < 2; i++) {
            for (int a = 1; a < (2 - i); a++) {
                //if one number is larger and in front
                if (realNumber[i] > realNumber[i + 1]) {
                    //hold it
                    holding = realNumber[i];
                    //and then swap it to the last
                    realNumber[i] = realNumber[i + 1];
                    realNumber[i + 1] = holding;
                }
            }
        }

        // place the integers in ascending order
        System.out.println("The two integers in ascending order are: " + realNumber[0] + ", " + realNumber[1]);
    }
}
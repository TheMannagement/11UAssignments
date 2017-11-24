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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int[] mark = new int[10];

        for (int i = 0; i < 10; i++) {
            // ask for the marks
            System.out.println("Please enter a mark of 10:");
            // store the marks
            mark[i] = input.nextInt();
        }

        //create a place to hold the higher mark to swap
        int holding = 0;
        //do this 10 times
        for (int i = 0; i < 9; i++) {
            for (int a = i + 1; a < 10; a++) {
                //if one number is larger and in front
                if (mark[i] > mark[a]) {
                    //hold it
                    holding = mark[i];
                    //and then swap it to the last
                    mark[i] = mark[a];
                    mark[a] = holding;
                }
            }
        }

        // place the integers in ascending order
        System.out.println("The marks from lowest to highest are: " + mark[0] + ", " + mark[1] + ", " + mark[2] + ", " + mark[3] + ", " + mark[4] + ", " + mark[5] + ", " + mark[6] + ", " + mark[7] + ", " + mark[8] + ", " + mark[9] + ".");
    }
}
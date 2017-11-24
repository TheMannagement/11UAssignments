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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        double[] mark = new double[1000];
        int students = 0;

        System.out.println("How many students?");
        students = input.nextInt();

        for (int i = 0; i < students; i++) {
            // ask for the marks
            System.out.println("Please enter a mark (" + (i+1) + "/" + students + "):");
            // store the marks
            mark[i] = input.nextInt();
        }

        //create a place to hold the higher mark to swap
        double holding = 0;
        //do this 10 times
        for (int i = 0; i < (students - 1); i++) {
            for (int a = i + 1; a < students; a++) {
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
        double median = 0;
        double media = 0;
        //if the students divided by two leaves a remainder of zero
        if (students % 2 == 0) {
            media = ((mark[students / 2] + mark[students / 2 - 1]) / 2);
        } else {
            //if not, just divide the students in half and locate that
            median = mark[students / 2];
        }
        // place the integers in ascending order
        System.out.println("The marks from lowest to highest are:");
        for (int i = 0; i < students; i++) {
            System.out.println(mark[i]);
        }
        if (median > 0) {
            System.out.println("The median mark is: " + median);
        }
        if (media > 0) {
            System.out.println("The media mark is: " + media);

        }
    }
}

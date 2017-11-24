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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] classroom = new int[1000];
        int students = 0;

        System.out.println("How many students?");
        students = input.nextInt();

        for (int i = 0; i < students; i++) {
            // ask for the marks
            System.out.println("Please enter a mark (" + (i + 1) + "/" + students + "):");
            // store the marks
            classroom[i] = input.nextInt();
        }

        //create a place to hold the higher mark to swap
        int holding = 0;
        //do this 10 times
        for (int i = 0; i < (students - 1); i++) {
            for (int a = i + 1; a < students; a++) {
                //if one number is larger and in front
                if (classroom[i] > classroom[a]) {
                    //hold it
                    holding = classroom[i];
                    //and then swap it to the last
                    classroom[i] = classroom[a];
                    classroom[a] = holding;
                }
            }
        }
        int total = 0;
        for (int i = 0; i < students; i++) {
            // add expense to total
            total = total + classroom[i];
        }
        double average = (total / students);
        // place the average, the lowest and the highest mark
        System.out.println("The average mark is: " + average);
        System.out.println("The lowest mark is: " + classroom[0]);
        System.out.println("The highest mark is: " + classroom[students - 1]);
    }
}

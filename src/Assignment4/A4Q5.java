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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //ask for name and test scores
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("What was your first test out of? :");
        double test1total = input.nextDouble();

        System.out.println("What mark did you get? :");
        double test1percent = input.nextDouble();

        System.out.println("What was your second test out of? :");
        double test2total = input.nextDouble();

        System.out.println("What mark did you get? :");
        double test2percent = input.nextDouble();

        System.out.println("What was your third test out of? :");
        double test3total = input.nextDouble();

        System.out.println("What mark did you get? :");
        double test3percent = input.nextDouble();

        System.out.println("What was your fourth test out of? :");
        double test4total = input.nextDouble();

        System.out.println("What mark did you get? :");
        double test4percent = input.nextDouble();

        System.out.println("What was your fifth test out of? :");
        double test5total = input.nextDouble();

        System.out.println("What mark did you get? :");
        double test5percent = input.nextDouble();


        //calculate and present results
        double test1mark = (test1percent / test1total) * 100;
        double test2mark = (test2percent / test2total) * 100;
        double test3mark = (test3percent / test3total) * 100;
        double test4mark = (test4percent / test4total) * 100;
        double test5mark = (test5percent / test5total) * 100;

        System.out.println("Test Scores for " + name + ":");
        System.out.println("Test 1: " + test1mark + "%");
        System.out.println("Test 2: " + test2mark + "%");
        System.out.println("Test 3: " + test3mark + "%");
        System.out.println("Test 4: " + test4mark + "%");
        System.out.println("Test 5: " + test5mark + "%");
        
        double testAverage = (test1mark + test2mark + test3mark + test4mark + test5mark)/5;
        
        System.out.println("Average: " + testAverage + "%");
        
    }
}

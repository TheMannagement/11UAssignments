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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //say hello
        Scanner input = new Scanner(System.in);
        
        //get name from user
        //them them to enter name
        System.out.println("Please enter your name:");
        String firstName = input.nextLine();
        
        //show the name again
        System.out.println("Hello " + firstName +". How are you today?");
    }
}

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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Enter sum of dice:");
        int roll = input.nextInt();


        int currentPlace = 0;

        while (true) {
            currentPlace = currentPlace + roll;
            if (roll > 12) {
                System.out.println("Don't cheat!");
                break;
            }
            if (roll == 1) {
                System.out.println("Don't cheat!");
                break;
            }

            if (roll <= 12) {
                System.out.println("Your current square is " + currentPlace + ". Roll again:");
                roll = input.nextInt();
            }
            if (roll == 0) {
                System.out.println("You Quit!");
                break;
            }

            if (currentPlace >= 100) {
                System.out.println("You Win!");
                break;
            }

            if (currentPlace == 9) {
                currentPlace = currentPlace + 25;
                System.out.println("Suprise, you climbed a ladder! Your current square is now " + currentPlace + "!");

            }
            if (currentPlace == 40) {
                currentPlace = currentPlace + 24;
                System.out.println("Suprise, you climbed a ladder! Your current square is now " + currentPlace + "!");

            }
            if (currentPlace == 67) {
                currentPlace = currentPlace + 19;
                System.out.println("Suprise, you climbed a ladder! Your current square is now " + currentPlace + "!");

            }
            if (currentPlace == 54) {
                currentPlace = currentPlace - 35;
                System.out.println("Uh-oh, you landed on a snake! Your current square is now " + currentPlace + ", but the previous roll was added.");

            }
            if (currentPlace == 90) {
                currentPlace = currentPlace - 42;
                System.out.println("Uh-oh, you landed on a snake! Your current square is now " + currentPlace + ", but the previous roll was added.");

            }
            if (currentPlace == 99) {
                currentPlace = currentPlace - 22;
                System.out.println("Uh-oh, you landed on a snake! Your current square is now " + currentPlace + ", but the previous roll was added.");

            }
        }
    }
}
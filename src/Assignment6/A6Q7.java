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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create array
        int[] p = new int[1000];
        //let p initally equal 2
        p[0] = 2;
        //create an index to store prime numbers (how many there are)
        int index = 1;
        int primeNumber = 1;
        //create a fancy-schmancy boolean array to see wether a number is prime or not
        boolean isPrimeNum = false;
        while ((primeNumber += 2) <= 1000) {
            isPrimeNum = true;
            for (int i = 0; i < index; i++) {
                //if it leaves a remainder of zero, it is false
                if (primeNumber % p[i] == 0) {
                    isPrimeNum = false;
                }
            }

            if (isPrimeNum) {
                p[index++] = primeNumber;
            }
        }

        System.out.println("Here are all of the prime numbers from 2 - 1000:");
        //output all numbers using what the index and int p has stored
        for (int i = 0; i < index; i++) {
            System.out.println(p[i]);
        }
    }
}

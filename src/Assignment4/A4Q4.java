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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         
            System.out.println("How much does food for prom cost? :");
            double foodCost = input.nextDouble();
            
            System.out.println("How much does the DJ cost? :");
            double djCost = input.nextDouble();
            
            System.out.println("how much does it cost to rent the hall? :");
            double hallCost = input.nextDouble();
            
            System.out.println("How much do decorations cost? :");
            double decorCost = input.nextDouble();
            
            System.out.println("How much does it cost for staff? :");
            double staffCost = input.nextDouble();
            
            System.out.println("How much for miscellaneous costs? :");
            double miscCost = input.nextDouble();
            
            double total = foodCost + djCost + hallCost + decorCost + staffCost + miscCost;
            double tickets = total/35;
            
         System.out.println("The total cost is $" + total +"."+ " You will need to sell " + tickets + " tickets to break even.");
    }
}

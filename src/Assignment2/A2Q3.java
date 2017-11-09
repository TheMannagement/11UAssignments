/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author macdn5071
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City tater = new City();

        //create robots
        Robot mango = new Robot(tater, 270, 160, Direction.WEST);

        //return to origin (0, 0)

        //if mango is not on an origin
        while (mango.getStreet() != 0) {
            //check direction
            if (mango.getDirection() != Direction.NORTH) {
                //turn left if direction is not north
                mango.turnLeft();
            } else {
                //move if it is
                mango.move();
            }
        }
        //if mango is on an origin
        while (mango.getAvenue() != 0) {
            //if direction is not west
            if (mango.getDirection() != Direction.WEST) {
                //turn until it is west
                mango.turnLeft();
            } else {
                //move if it is
                mango.move();
            }
        }
    }
}

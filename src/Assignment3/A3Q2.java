/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author macdn5071
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City tater = new City();

        //ask how many things there are
        tater.showThingCounts(true);

        //create robots
        Robot mango = new Robot(tater, 2, 2, Direction.EAST);

        //make 10 things
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);
        new Thing(tater, 2, 2);

        //move the things
        for (int moveThings = 0; moveThings < 11; moveThings = moveThings + 1) {
            if (mango.canPickThing()) {
                mango.pickThing();
                mango.move();
                mango.putThing();
                mango.turnLeft();
                mango.turnLeft();
                mango.move();
                mango.turnLeft();
                mango.turnLeft();
            } else {
                mango.move();
            }
        }

    }
}

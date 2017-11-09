/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author macdn5071
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create the city
        City tater = new City();

        //create the robots
        Robot mango = new Robot(tater, 1, 1, Direction.EAST);

        //create 10 things
        new Thing(tater, 1, 2);
        new Thing(tater, 1, 3);
        new Thing(tater, 1, 4);
        new Thing(tater, 1, 5);
        new Thing(tater, 1, 6);
        new Thing(tater, 1, 7);
        new Thing(tater, 1, 8);
        new Thing(tater, 1, 9);
        new Thing(tater, 1, 10);
        new Thing(tater, 1, 11);

        //check the front
        while (mango.frontIsClear()) {
            //if backpack has less than 7 items
            if (mango.countThingsInBackpack() < 7) {
                if (mango.canPickThing()) {
                    mango.pickThing();
                } else {
                    mango.move();
                }
                //if backpack has 7 items
                if (mango.countThingsInBackpack() == 7) {
                    //move
                    mango.move();

                    //ignore items on the ground
                    while (mango.canPickThing()) {
                        mango.move();
                    }
                }
            }
        }
    }
}

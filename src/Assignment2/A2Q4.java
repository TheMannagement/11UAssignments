/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author macdn5071
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City tater = new City();

        //crrate robots
        Robot mango = new Robot(tater, 1, 2, Direction.EAST);

        //create the castle
        new Wall(tater, 1, 1, Direction.NORTH);
        new Wall(tater, 1, 1, Direction.SOUTH);
        new Wall(tater, 1, 1, Direction.WEST);
        new Wall(tater, 1, 1, Direction.EAST);

        new Wall(tater, 1, 4, Direction.NORTH);
        new Wall(tater, 1, 4, Direction.SOUTH);
        new Wall(tater, 1, 4, Direction.EAST);
        new Wall(tater, 1, 4, Direction.WEST);

        new Wall(tater, 4, 4, Direction.NORTH);
        new Wall(tater, 4, 4, Direction.SOUTH);
        new Wall(tater, 4, 4, Direction.EAST);
        new Wall(tater, 4, 4, Direction.WEST);

        new Wall(tater, 4, 1, Direction.NORTH);
        new Wall(tater, 4, 1, Direction.SOUTH);
        new Wall(tater, 4, 1, Direction.EAST);
        new Wall(tater, 4, 1, Direction.WEST);

        new Wall(tater, 2, 2, Direction.NORTH);
        new Wall(tater, 3, 2, Direction.SOUTH);
        new Wall(tater, 3, 3, Direction.EAST);
        new Wall(tater, 2, 2, Direction.WEST);
        new Wall(tater, 2, 3, Direction.NORTH);
        new Wall(tater, 3, 3, Direction.SOUTH);
        new Wall(tater, 2, 3, Direction.EAST);
        new Wall(tater, 3, 2, Direction.WEST);

        //patrol the building
        while (!mango.canPickThing()) {
            if (!mango.frontIsClear()) {
                mango.turnLeft();
            } else {
                if (mango.frontIsClear()) {
                    mango.move();
                    mango.turnLeft();
                    mango.turnLeft();
                    mango.turnLeft();
                }
            }
        }
    }
}
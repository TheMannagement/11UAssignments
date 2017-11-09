/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author macdn5071
 */
public class A2_Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //city
        City tater = new City();

        //robots
        Robot mango = new Robot(tater, 0, 3, Direction.SOUTH);

        //create all the things and walls
        //oh god

        //road
        new Wall(tater, 1, 1, Direction.WEST);
        new Wall(tater, 2, 1, Direction.WEST);
        new Wall(tater, 3, 1, Direction.WEST);
        new Wall(tater, 4, 1, Direction.WEST);
        new Wall(tater, 5, 1, Direction.WEST);
        new Wall(tater, 6, 1, Direction.WEST);
        new Wall(tater, 7, 1, Direction.WEST);
        new Wall(tater, 8, 1, Direction.WEST);
        new Wall(tater, 9, 1, Direction.WEST);
        new Wall(tater, 0, 1, Direction.WEST);

        new Wall(tater, 1, 2, Direction.EAST);
        new Wall(tater, 2, 2, Direction.EAST);
        new Wall(tater, 3, 2, Direction.EAST);
        new Wall(tater, 4, 2, Direction.EAST);
        new Wall(tater, 5, 2, Direction.EAST);
        new Wall(tater, 6, 2, Direction.EAST);
        new Wall(tater, 7, 2, Direction.EAST);
        new Wall(tater, 8, 2, Direction.EAST);
        new Wall(tater, 9, 2, Direction.EAST);
        new Wall(tater, 0, 2, Direction.EAST);

        //sidewalk and driveways
        new Wall(tater, 0, 3, Direction.EAST);
        new Wall(tater, 0, 3, Direction.NORTH);

        new Wall(tater, 1, 4, Direction.NORTH);
        new Wall(tater, 1, 5, Direction.NORTH);
        new Wall(tater, 1, 6, Direction.NORTH);
        new Wall(tater, 1, 7, Direction.NORTH);

        new Wall(tater, 1, 7, Direction.EAST);
        new Wall(tater, 2, 7, Direction.EAST);

        new Wall(tater, 2, 4, Direction.SOUTH);
        new Wall(tater, 2, 5, Direction.SOUTH);
        new Wall(tater, 2, 6, Direction.SOUTH);
        new Wall(tater, 2, 7, Direction.SOUTH);

        new Wall(tater, 3, 3, Direction.EAST);

        new Wall(tater, 4, 4, Direction.NORTH);
        new Wall(tater, 4, 5, Direction.NORTH);
        new Wall(tater, 4, 6, Direction.NORTH);

        new Wall(tater, 4, 6, Direction.EAST);

        new Wall(tater, 4, 4, Direction.SOUTH);
        new Wall(tater, 4, 5, Direction.SOUTH);
        new Wall(tater, 4, 6, Direction.SOUTH);

        new Wall(tater, 5, 3, Direction.EAST);
        new Wall(tater, 6, 3, Direction.EAST);

        new Wall(tater, 7, 4, Direction.NORTH);
        new Wall(tater, 7, 5, Direction.NORTH);
        new Wall(tater, 7, 6, Direction.NORTH);
        new Wall(tater, 7, 7, Direction.NORTH);
        new Wall(tater, 7, 8, Direction.NORTH);

        new Wall(tater, 7, 8, Direction.EAST);
        new Wall(tater, 8, 8, Direction.EAST);

        new Wall(tater, 8, 4, Direction.SOUTH);
        new Wall(tater, 8, 5, Direction.SOUTH);
        new Wall(tater, 8, 6, Direction.SOUTH);
        new Wall(tater, 8, 7, Direction.SOUTH);
        new Wall(tater, 8, 8, Direction.SOUTH);

        new Wall(tater, 9, 3, Direction.EAST);
        new Wall(tater, 9, 3, Direction.SOUTH);

        //now the snow
        new Thing(tater, 1, 3);
        new Thing(tater, 1, 4);
        new Thing(tater, 1, 5);
        new Thing(tater, 2, 3);
        new Thing(tater, 2, 5);
        new Thing(tater, 1, 6);
        new Thing(tater, 2, 7);
        new Thing(tater, 4, 3);
        new Thing(tater, 7, 3);
        new Thing(tater, 4, 4);
        new Thing(tater, 4, 5);
        new Thing(tater, 7, 4);
        new Thing(tater, 8, 4);
        new Thing(tater, 8, 5);
        new Thing(tater, 7, 8);
        new Thing(tater, 8, 7);

        //pick up the snow with right-hand following
        while (!mango.canPickThing()) {
            if (!mango.frontIsClear()) {
                mango.turnLeft();
            } else {
                if (mango.frontIsClear()) {
                    mango.move();
                    mango.turnLeft();
                    mango.turnLeft();
                    mango.turnLeft();
                    //if there is snow
                    if (mango.canPickThing()) {
                        //shovel it
                        mango.pickThing();
                    }
                }
            }
        }

    }
}

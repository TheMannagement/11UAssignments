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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create the city
        City tater = new City();

        //create the robots
        Robot mango = new Robot(tater, 4, 0, Direction.EAST);

        //create the track
        new Wall(tater, 4, 0, Direction.SOUTH);
        new Wall(tater, 4, 1, Direction.SOUTH);
        new Wall(tater, 4, 2, Direction.SOUTH);
        new Wall(tater, 4, 3, Direction.SOUTH);
        new Wall(tater, 4, 4, Direction.SOUTH);
        new Wall(tater, 4, 5, Direction.SOUTH);
        new Wall(tater, 4, 6, Direction.SOUTH);
        new Wall(tater, 4, 7, Direction.SOUTH);
        new Wall(tater, 4, 8, Direction.SOUTH);
        new Wall(tater, 4, 7, Direction.EAST);
        new Wall(tater, 4, 2, Direction.EAST);
        new Wall(tater, 4, 3, Direction.EAST);
        new Wall(tater, 4, 5, Direction.EAST);

        //create the finish line
        new Thing(tater, 4, 8);

        //look for walls in front
        while (!mango.canPickThing()) {
            if (!mango.frontIsClear()) {
                //turn if there is a wall
                mango.turnLeft();
            } else {
                if (mango.frontIsClear()) {
                    //move forward but look for walls on right side
                    mango.move();
                    mango.turnLeft();
                    mango.turnLeft();
                    mango.turnLeft();
                } else {
                    //until mango can pick something up
                    if (mango.canPickThing()) {
                        mango.turnLeft();
                    }
                }
            }
        }
    }
}

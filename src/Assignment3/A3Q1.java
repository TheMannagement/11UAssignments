/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author macdn5071
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //new city
        City tater = new City();

        //robots
        Robot mango = new Robot(tater, 0, 3, Direction.WEST);

        //building
        new Wall(tater, 1, 2, Direction.NORTH);
        new Wall(tater, 1, 1, Direction.NORTH);
        new Wall(tater, 1, 1, Direction.WEST);
        new Wall(tater, 2, 2, Direction.EAST);
        new Wall(tater, 2, 1, Direction.WEST);
        new Wall(tater, 1, 2, Direction.EAST);
        new Wall(tater, 2, 2, Direction.SOUTH);
        new Wall(tater, 2, 1, Direction.SOUTH);

        //circle the building
        for (int circle = 0; circle < 8; circle = circle + 1) {
            mango.move();
            mango.move();
            mango.move();
            mango.turnLeft();
        }
    }
}

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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City tater = new City();

        //ask how many things there are
        tater.showThingCounts(true);

        //create robot and give him crops
        Robot mango = new Robot(tater, 3, 3, Direction.SOUTH);

        new Wall(tater, 1, 2, Direction.NORTH);
        new Wall(tater, 1, 1, Direction.NORTH);
        new Wall(tater, 1, 1, Direction.WEST);
        new Wall(tater, 2, 2, Direction.EAST);
        new Wall(tater, 2, 1, Direction.WEST);
        new Wall(tater, 1, 2, Direction.EAST);
        new Wall(tater, 2, 2, Direction.SOUTH);
        new Wall(tater, 2, 1, Direction.SOUTH);

        new Wall(tater, 1, 4, Direction.NORTH);
        new Wall(tater, 1, 5, Direction.NORTH);
        new Wall(tater, 1, 4, Direction.WEST);
        new Wall(tater, 2, 5, Direction.EAST);
        new Wall(tater, 2, 4, Direction.WEST);
        new Wall(tater, 1, 5, Direction.EAST);
        new Wall(tater, 2, 4, Direction.SOUTH);
        new Wall(tater, 2, 5, Direction.SOUTH);

        new Wall(tater, 4, 1, Direction.NORTH);
        new Wall(tater, 4, 2, Direction.NORTH);
        new Wall(tater, 4, 1, Direction.WEST);
        new Wall(tater, 4, 2, Direction.EAST);
        new Wall(tater, 5, 1, Direction.WEST);
        new Wall(tater, 5, 2, Direction.EAST);
        new Wall(tater, 5, 2, Direction.SOUTH);
        new Wall(tater, 5, 1, Direction.SOUTH);

        new Wall(tater, 4, 4, Direction.NORTH);
        new Wall(tater, 4, 5, Direction.NORTH);
        new Wall(tater, 4, 4, Direction.WEST);
        new Wall(tater, 4, 5, Direction.EAST);
        new Wall(tater, 5, 4, Direction.WEST);
        new Wall(tater, 5, 5, Direction.EAST);
        new Wall(tater, 5, 4, Direction.SOUTH);
        new Wall(tater, 5, 5, Direction.SOUTH);

        //patrol all of them once

        for (int patrolAll = 0; patrolAll < 1; patrolAll = patrolAll + 1) {
            for (int patrolOne = 0; patrolOne < 4; patrolOne = patrolOne + 1) {
                mango.move();
                mango.move();
                mango.move();
                mango.turnLeft();
                mango.move();
                mango.move();
                mango.move();
                mango.turnLeft();
                mango.move();
                mango.move();
                mango.move();
                mango.turnLeft();
                mango.move();
                mango.move();
                mango.move();
            }
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author macdn5071
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City tater = new City();
        
        //create house
        new Wall(tater, 1, 1, Direction.NORTH);
        new Wall(tater, 1, 2, Direction.NORTH);
        new Wall(tater, 1, 1, Direction.WEST);
        new Wall(tater, 2, 1, Direction.WEST);
        new Wall(tater, 2, 1, Direction.SOUTH);
        new Wall(tater, 1, 2, Direction.SOUTH);
        new Wall(tater, 1, 2, Direction.EAST);
        
        //create robot
        Robot mango = new Robot(tater, 1, 2, Direction.SOUTH);
        
        //create newspaper
        new Thing(tater, 2, 2);
        
        //have mango grab the newspaper
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.move();
        mango.pickThing();
        
        //have mango go back to bed
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        
    }
}

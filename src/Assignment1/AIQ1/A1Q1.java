/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author macdn5071
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new city
        City tater = new City();
        
        //create 8 walls
        new Wall(tater, 3, 2, Direction.NORTH);
        new Wall(tater, 3, 3, Direction.NORTH);
        new Wall(tater, 3, 2, Direction.WEST);
        new Wall(tater, 4, 2, Direction.WEST);
        new Wall(tater, 4, 3, Direction.SOUTH);
        new Wall(tater, 4, 2, Direction.SOUTH);
        new Wall(tater, 3, 3, Direction.EAST);
        new Wall(tater, 4, 3, Direction.EAST);
        
        //create robot
        Robot mango = new Robot (tater, 3, 4, Direction.NORTH);
        
        //make mango circle the block
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
        mango.turnLeft();
        mango.move();
        mango.move();
        
        
    }
}

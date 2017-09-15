/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.AIQ1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author macdn5071
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City tater = new City();
        
        //create a mountain
        new Wall(tater, 3, 2, Direction.WEST);
        new Wall(tater, 3, 2, Direction.NORTH);
        new Wall(tater, 2, 3, Direction.WEST);
        new Wall(tater, 1, 3, Direction.WEST);
        new Wall(tater, 1, 3, Direction.NORTH);
        new Wall(tater, 1, 3, Direction.EAST);
        new Wall(tater, 2, 4, Direction.EAST);
        new Wall(tater, 2, 4, Direction.NORTH);
        new Wall(tater, 3, 4, Direction.EAST);
        
        //create a robot
        Robot mango = new Robot(tater, 3, 0, Direction.EAST);
        mango.setColor(Color.orange);
        
        //create a flag
        new Thing(tater, 3, 1);
        
        //grab flag and climb the mountain
        mango.move();
        mango.pickThing();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.move();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        
        //place the flag and descend
        mango.putThing();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.move();
        mango.turnLeft();
        
    }
}

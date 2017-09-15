/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.AIQ1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author macdn5071
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City tater = new City();
        
        //create a wall
        new Wall(tater, 0, 1, Direction.WEST);
        new Wall(tater, 1, 1, Direction.WEST);
        new Wall(tater, 1, 1, Direction.SOUTH);
        
        //create the team
        Robot mango = new Robot(tater, 0, 0, Direction.SOUTH);
        mango.setColor(Color.ORANGE);
        
        Robot angela = new Robot(tater, 0, 1, Direction.SOUTH);
        angela.setColor(Color.MAGENTA);
        
        //have them meet
        
        mango.move();
        angela.move();
        mango.move();
        angela.turnLeft();
        mango.turnLeft();
        angela.move();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.move();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        mango.move();
        angela.move();
    }
}

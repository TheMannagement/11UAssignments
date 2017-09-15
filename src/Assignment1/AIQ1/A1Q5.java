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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the city
        City tater = new City();
        
        //create the house
        new Wall(tater, 2, 3, Direction.WEST);
        new Wall(tater, 2, 3, Direction.NORTH);
        new Wall(tater, 2, 3, Direction.EAST);
        new Wall(tater, 3, 3, Direction.EAST);
        new Wall(tater, 3, 3, Direction.SOUTH);
        
        //create the team
        
        Robot mango = new Robot(tater, 3, 3, Direction.EAST);
        mango.setColor(Color.ORANGE);
        mango.setLabel("M");
        
        Robot angela = new Robot(tater, 0, 1, Direction.WEST);
        angela.setColor(Color.MAGENTA);
        angela.setLabel("A");
        
        //create the items
        new Thing(tater, 0, 0);
        new Thing(tater, 1, 0);
        new Thing(tater, 1, 1);
        new Thing(tater, 1, 2);
        new Thing(tater, 2, 2);
        
        //have angela pick up 3 items
        angela.move();
        angela.pickThing();
        angela.turnLeft();
        angela.move();
        angela.pickThing();
        angela.turnLeft();
        
        //mango hears her
        mango.turnLeft();
        mango.turnLeft();
        mango.move();
        mango.turnLeft();
        mango.turnLeft();
        mango.turnLeft();
        
        //angela asks for help
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        
        //mango picks up some of his stuff
        mango.move();
        mango.pickThing();
        mango.move();
        mango.pickThing();
        mango.turnLeft();
        
        //angela grabs the last item and scolds mango for dropping his items
        angela.move();
        angela.pickThing();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
        angela.turnLeft();
       
    }
}

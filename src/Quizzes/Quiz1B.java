/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author macdn5071
 */
public class Quiz1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Numbers needed to be changed in order for #2 to work.
        //Probably doesn't count, then.

        //create city
        City tater = new City();
        //create robot
        Robot mango = new Robot(tater, 2, 2, Direction.EAST);

        tater.showThingCounts(true);

        //create the mine
        new Wall(tater, 2, 2, Direction.WEST);

        new Wall(tater, 2, 5, Direction.NORTH);
        new Wall(tater, 2, 6, Direction.NORTH);
        new Wall(tater, 2, 7, Direction.NORTH);


        new Wall(tater, 2, 5, Direction.SOUTH);
        new Wall(tater, 2, 6, Direction.SOUTH);
        new Wall(tater, 2, 7, Direction.SOUTH);

        new Wall(tater, 2, 7, Direction.EAST);

        //create the boulders

        new Thing(tater, 2, 5);
        new Thing(tater, 2, 6);
        new Thing(tater, 2, 7);

        //move the boulders
        for (int moveThings = 0; moveThings < 3; moveThings = moveThings + 1) {
            for (int move = 0; move < 8; move = move + 1) {
                if (mango.frontIsClear()) {
                    mango.move();
                    if (mango.canPickThing()) {
                        if (mango.getDirection() == Direction.EAST) {
                            //grab it and turn around
                            mango.pickThing();
                            mango.turnLeft();
                            mango.turnLeft();
                        }
                    }
                    if (!mango.frontIsClear()) {
                        //place it and turn around
                        mango.putThing();
                        mango.turnLeft();
                        mango.turnLeft();
                    }
                }
            }


        }
    }
}

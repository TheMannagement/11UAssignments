/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author macdn5071
 */
public class A3Q3 {

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
        Robot mango = new Robot(tater, 1, 1, Direction.EAST, 20);

        //plant the crops
        for (int plantCrops = 0; plantCrops < 4; plantCrops = plantCrops + 1) {
            for (int cropPlant = 0; cropPlant < 5; cropPlant = cropPlant + 1) {
                mango.putThing();
                mango.move();
            }
            mango.turnLeft();
            mango.turnLeft();
            while (mango.getAvenue() != 1) {
                mango.move();
            }
            mango.turnLeft();
            mango.move();
            mango.turnLeft();

        }
        for (int row = 0; row < 5; row = row + 1) {
        }
    }
}

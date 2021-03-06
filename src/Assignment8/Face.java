/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author macdn5071
 */
public class Face extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    //Title of the window
    String title = "The Face";

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // YOUR GAME VARIABLES WOULD GO HERE
    // get tongue color
    Color tongue = new Color(232, 74, 127);
    
    // get slobber color
    Color slobber = new Color(92, 224, 250);
    
    // create tongue and slobbers
    int raspberry = 100;
    int direction = -1;
    // int slobber1 = 450;
    // int slobber2 = 460;
    // int slobber3 = 455;
    
    // create a wink
    int wink = 75;
    int eyelid = 1;

    // GAME VARIABLES END HERE   

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Face(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        // eyes
        g.fillRect(200, 100, 75, wink);
        g.fillRect(500, 100, 75, wink);
        // nose
        g.fillRect(510, 190, 75, 75);
        g.fillRect(430, 190, 140, 10);
        // mouth
        g.fillRect(450, 350, 50, 50);
        g.fillRect(400, 350, 50, 50);
        g.fillRect(350, 350, 50, 50);
        g.fillRect(300, 350, 50, 50);
        g.fillRect(250, 350, 50, 50);
        g.fillRect(500, 350, 50, 50);
        // smile
        g.fillRect(225, 350, 50, 50);
        g.fillRect(200, 340, 50, 50);
        g.fillRect(525, 350, 50, 50);
        // tongue
        g.setColor(tongue);
        g.fillRect(330, 375, 200, raspberry);
        // slobber
        //g.setColor(slobber);
        //g.fillRect(502, slobber1, 30, 30);
        //g.fillRect(476, slobber2, 30, 30);
        //g.fillRect(452, slobber3, 30, 30);
        
        // GAME DRAWING ENDS HERE
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
       // Any of your pre setup before the loop starts should go here

       
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            //slobber1 = slobber1 + 2;
            //if(slobber1 > 610){
             //   slobber1 = 450;
            //}
           // slobber2 = slobber2 + 2;
           // if(slobber2 > 610){
           //     slobber2 = 450;
           // }
           // slobber3 = slobber3 + 2;
           // if(slobber3 > 610){
           //     slobber3 = 450;
           // }
            
            raspberry = raspberry + direction;
            if(raspberry < -50){
                direction = 1;
            }
            if(raspberry > 100){
                direction = -1;
            }
            //wink = wink + eyelid;
            //if(wink > 75){
            //    eyelid = -1;
            //}
            //if(wink < -10){
            //    eyelid = 1;
            //}
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
            
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
    }
    
    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
            
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Face game = new Face();
                
        // starts the game loop
        game.run();
    }
}

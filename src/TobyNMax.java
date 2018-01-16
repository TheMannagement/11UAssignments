/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author macdn5071
 */
public class TobyNMax extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    //Title of the window
    String title = "Toby N' Max";

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // YOUR GAME VARIABLES WOULD GO HERE
    // player variables 
    // red, right
    Rectangle max = new Rectangle(WIDTH/2 + 30, HEIGHT - 100, 20, 20);
    // blue, left
    Rectangle toby = new Rectangle(WIDTH / 2 - 50, HEIGHT - 100, 20, 20);
    // displacement in the x and y directions
    int maxDX = 0;
    int maxDY = 0;
    int tobyDX = 0;
    int tobyDY = 0;
    
    // gravity strength
    //int gravity = 1;
    
    // blocks in the level
    Rectangle[] blocks = new Rectangle[33];
    
    // flag in the level
    Rectangle[] flag = new Rectangle[1];
    Rectangle[] flagPole = new Rectangle[1];
    Rectangle[] flagLogo = new Rectangle[1];
    
    // control variables (max)
    boolean left1 = false;
    boolean right1 = false;
    boolean up1 = false;
    boolean down1 = false;
    boolean dagger1 = false;
    boolean grenade1 = false;
    
    // Player (toby)
    boolean left2 = false;
    boolean right2 = false;
    boolean up2 = false;
    boolean down2 = false;
    boolean dagger2 = false;
    boolean grenade2 = false;
    
    // player scores
    int maxScore = 0;
    int tobyScore = 0;
    boolean maxWin = false;
    boolean tobyWin = false;
    
    // fonts
    Font biggerFont = new Font("arial", Font.BOLD, 42);
    Font titleFont = new Font("arial", Font.PLAIN, 17);
    Font giantFont = new Font("arial", Font.ITALIC, 60);
    
    // colours
    Color purple = new Color(131, 47, 235);
    Color brown = new Color(110, 92, 54);
    
    // GAME VARIABLES END HERE   

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public TobyNMax(){
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
        frame.addKeyListener(new TobyNMax.Keyboard());
        TobyNMax.Mouse m = new TobyNMax.Mouse();
        
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
        
        
        // draw the blocks
        g.setColor(Color.black);
        for(int i = 0; i < blocks.length; i++){
            g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
        }
        
        // middle ref (no longer needed)
        //g.setColor(Color.black);
        //g.drawRect(WIDTH/2 - 1, 0, 1, HEIGHT);
        
        // scores
        g.setFont(biggerFont);
        g.setColor(Color.blue);
        g.drawString("" + tobyScore, WIDTH/2-100, 75);
        if(tobyWin){
            g.drawString("Toby Wins!", WIDTH/2-115, 120);
        }
        g.setColor(Color.red);
        if(maxWin){
            g.drawString("Max Wins!", WIDTH/2-115, 120);
        }
        g.drawString("" + maxScore, WIDTH/2+100, 75);
        g.setColor(Color.white);
        g.setFont(titleFont);
        g.drawString("Toby N' Max: Capture the Flag!", 25, 20);
        
        // draw the player
        g.setColor(Color.red);
        g.fillRect(max.x, max.y, max.width, max.height);
        g.setColor(Color.blue);
        g.fillRect(toby.x, toby.y, toby.width, toby.height);
        
        // draw the flag
        g.setColor(brown);
        for(int i = 0; i < flagPole.length; i++){
            g.fillRect(flagPole[i].x, flagPole[i].y, flagPole[i].width, flagPole[i].height);
        }
        
        g.setColor(purple);
        for(int i = 0; i < flag.length; i++){
            g.fillRect(flag[i].x, flag[i].y, flag[i].width, flag[i].height);
        }
        
        g.setColor(Color.white);
        for(int i = 0; i < flagLogo.length; i++){
            g.fillRect(flagLogo[i].x, flagLogo[i].y, flagLogo[i].width, flagLogo[i].height);
        }
        
        //g.setColor(Color.gray);
       // for(int i = 0; i < bombs.length; i++){
        //  g.fillRect(bombs[i].x, bombs[i].y, bombs[i].width, bombs[i].height);  
        //}
        
        
        // GAME DRAWING ENDS HERE
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
       // Any of your pre setup before the loop starts should go here
        
        // border
        blocks[0] = new Rectangle(0, 0, 25, 600);
        blocks[1] = new Rectangle(775, 0, 25, 600);
        blocks[2] = new Rectangle(0, 0, 800, 25);
        blocks[3] = new Rectangle(0, 575, 800, 25);
        
        // starting room
        // right wall
        blocks[5] = new Rectangle(WIDTH / 2 + 75, 400, 25, 150);
        // left wall
        blocks[10] = new Rectangle(WIDTH / 2 - 100, 400, 25, 150);
        // centre
        blocks[7] = new Rectangle(WIDTH / 2 - 10, 450, 20, 150);
        // top wall
        blocks[11] = new Rectangle(WIDTH / 2 - 50, 400, 100, 25);
        
        
        // remember to copy to the other side
        // cover (west)
        blocks[4] = new Rectangle(200, 200, 25, 75);
        blocks[6] = new Rectangle(200 , 400, 25, 75);
        blocks[8] = new Rectangle(200, 310, 25, 50);
        blocks[9] = new Rectangle(200, 0, 25, 170);
        blocks[17] = new Rectangle(200 - 50, 145, 70, 25);
        blocks[23] = new Rectangle(0, 60, 100, 24);
        blocks[24] = new Rectangle(70, 500, 24, 100);
        blocks[25] = new Rectangle(70, 500, 80, 24);
        blocks[26] = new Rectangle();
        
        
        // cover (east)
        blocks[15] = new Rectangle(WIDTH - 225, 200, 25, 75);
        blocks[14] = new Rectangle(WIDTH - 225 , 400, 25, 75);
        blocks[13] = new Rectangle(WIDTH - 225, 310, 25, 50);
        blocks[12] = new Rectangle(WIDTH - 225, 0, 25, 170);
        blocks[16] = new Rectangle(WIDTH - 225, 145, 70, 25);
        blocks[27] = new Rectangle(WIDTH - 100, 60, 100, 24);
        blocks[28] = new Rectangle(WIDTH - 94, 500, 24, 100);
        blocks[29] = new Rectangle(WIDTH - 94 - (80-24), 500, 80, 24);
        blocks[30] = new Rectangle();
        
        // cover (middle)
        // vertical
        blocks[18] = new Rectangle(WIDTH/ 2 - 10, 150, 20, 125);
        blocks[22] = new Rectangle(WIDTH/ 2 - 10, 300, 20, 50);
        // horizontal
        blocks[19] = new Rectangle(WIDTH/ 2 - 100, 175, 200, 20);
        blocks[20] = new Rectangle(WIDTH/ 2 - 100, 225, 200, 20);
        blocks[21] = new Rectangle(WIDTH/ 2 - 100, 350, 200, 20);
        
        
        // extras
        blocks[31] = new Rectangle();
        blocks[32] = new Rectangle();
        
        // flag on the level
        flag[0] = new Rectangle((int)(Math.random()*((WIDTH - 40) - 40 + 1)) + 40, (int)(Math.random()*((HEIGHT - 40) - 40 + 1)) + 40, 35, 26);
        flagPole[0] = new Rectangle(flag[0].x, flag[0].y, 4, 45);
        flagLogo[0] = new Rectangle(flag[0].x + 15, flag[0].y + (13/2), 20, 15);
        
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
            
            // PLAYER 1 CONTROLS
            if(right1){
                maxDX = 3;
            }else if(left1){
                maxDX = -3;
            }else{
                maxDX = 0;
            }
            
            if(up1){
                maxDY = 3;
            }else if(down1){
                maxDY = -3;
            }else{
                maxDY = 0;
            }
            
            // PLAYER 2 CONTROLS
            if(right2){
                tobyDX = 3;
            }else if(left2){
                tobyDX = -3;
            }else{
                tobyDX = 0;
            }
            
            if(up2){
                tobyDY = 3;
            }else if(down2){
                tobyDY = -3;
            }else{
                tobyDY = 0;
            }
            
            
            
            // jump
            //if(onGround && jump){
                // do something about jumping
                // big negative to start moving
               // playerDY = -15;
                // not on ground anymore 
               // onGround = false;
        //    }
            
            // apply gravity
            //playerDY = playerDY + gravity;
            
            // update the player 1
            max.x = max.x + maxDX;
            max.y = max.y + maxDY;
            
            // update the player 2
            toby.x = toby.x + tobyDX;
            toby.y = toby.y + tobyDY;
            
            // assume not standing on anything
            //onGround = false;
            // check for collisions
            // go through every block and check with loop
            
            // Player 1 Collision
            for(int i = 0; i < blocks.length; i++){
                //did the player hit a block?
                if(max.intersects(blocks[i])){
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, max.y + max.height) - Math.max(blocks[i].y, max.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, max.x + max.width) - Math.max(blocks[i].x, max.x);
                    
                    // determine the smaller one to find
                    if(cWidth < cHeight){
                        // fix the width
                        // player on left side
                        if(max.x < blocks[i].x){
                            max.x = max.x - cWidth;
                        }else{
                            max.x = max.x + cWidth;
                        }
                        // stop the player moving sideways
                        maxDX = 0;
                    }else{
                        // above the block
                        if(max.y < blocks[i].y){
                            max.y = max.y - cHeight;
                            
                            // moving up or down?
                            if(maxDY >= 0){
                                // stop the down motion
                                maxDY = 0;
                                // standing on ground
                                //onGround = true;
                            }
                            
                        }else{
                            // below the block
                            max.y = max.y + cHeight;
                        }
                    }
                }
            }
            
            // Player 1 flag collision
            for(int i = 0; i < flag.length; i++){
                //did the player hit a block?
                if(max.intersects(flag[i])){
                    maxScore++;
                    flag[0] = new Rectangle((int)(Math.random()*((WIDTH - 40) - 40 + 1)) + 40, (int)(Math.random()*((HEIGHT - 40) - 40 + 1)) + 40, 35, 26);
                    flagPole[0] = new Rectangle(flag[0].x, flag[0].y, 4, 45);
                    flagLogo[0] = new Rectangle(flag[0].x + 15, flag[0].y + (13/2), 20, 15);
                }
            }
            
            
            // Player 2 collison
            for(int i = 0; i < blocks.length; i++){
                //did the player hit a block?
                if(toby.intersects(blocks[i])){
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, toby.y + toby.height) - Math.max(blocks[i].y, toby.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, toby.x + toby.width) - Math.max(blocks[i].x, toby.x);
                    
                    // determine the smaller one to find
                    if(cWidth < cHeight){
                        // fix the width
                        // player on left side
                        if(toby.x < blocks[i].x){
                            toby.x = toby.x - cWidth;
                        }else{
                            toby.x = toby.x + cWidth;
                        }
                        // stop the player moving sideways
                        tobyDX = 0;
                    }else{
                        // above the block
                        if(toby.y < blocks[i].y){
                            toby.y = toby.y - cHeight;
                            
                            // moving up or down?
                            if(tobyDY >= 0){
                                // stop the down motion
                                tobyDY = 0;
                                // standing on ground
                                //onGround = true;
                            }
                            
                        }else{
                            // below the block
                            toby.y = toby.y + cHeight;
                        }
                    }
                }
            }
            
            // Player 2 flag collision
            for(int i = 0; i < flag.length; i++){
                //did the player hit a block?
                if(toby.intersects(flag[i])){
                    tobyScore++;
                    flag[0] = new Rectangle((int)(Math.random()*((WIDTH - 40) - 40 + 1)) + 40, (int)(Math.random()*((HEIGHT - 40) - 40 + 1)) + 40, 35, 26);
                    flagPole[0] = new Rectangle(flag[0].x, flag[0].y, 4, 45);
                    flagLogo[0] = new Rectangle(flag[0].x + 15, flag[0].y + (13/2), 20, 15);
                }
            }
            
            if(maxScore == 20){
                done = true;
                maxWin = true;
            }
            if(tobyScore == 20 ){
                done = true;
                tobyWin = true;
            }
            
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
            // determine the key
            int key = e.getKeyCode();
            // figure out which key
            if(key == KeyEvent.VK_RIGHT){
                right1 = true;
            }else if(key == KeyEvent.VK_LEFT){
                left1 = true;
            }else if(key == KeyEvent.VK_UP){
                down1 = true;
            }else if(key == KeyEvent.VK_DOWN){
                up1 = true;
            }else if(key == KeyEvent.VK_E){
                dagger1 = true;
            }else if(key == KeyEvent.VK_F){
                grenade1 = true;
            }
            
            
            
            // PLAYER 2
            if(key == KeyEvent.VK_D){
                right2 = true;
            }else if(key == KeyEvent.VK_A){
                left2 = true;
            }else if(key == KeyEvent.VK_W){
                down2 = true;
            }else if(key == KeyEvent.VK_S){
                up2 = true;
            }else if(key == KeyEvent.VK_SHIFT){
                dagger2 = true;
            }else if(key == KeyEvent.VK_CONTROL){
                grenade2 = true;
            }
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            // determine the key
            int key = e.getKeyCode();
            // figure out which key
            if(key == KeyEvent.VK_RIGHT){
                right1 = false;
            }else if(key == KeyEvent.VK_LEFT){
                left1 = false;
            }else if(key == KeyEvent.VK_UP){
                down1 = false;
            }else if(key == KeyEvent.VK_DOWN){
                up1 = false;
            }else if(key == KeyEvent.VK_E){
                dagger1 = false;
            }else if(key == KeyEvent.VK_F){
                grenade1 = false;
            }
            
            
            
            // PLAYER 2
            if(key == KeyEvent.VK_D){
                right2 = false;
            }else if(key == KeyEvent.VK_A){
                left2 = false;
            }else if(key == KeyEvent.VK_W){
                down2 = false;
            }else if(key == KeyEvent.VK_S){
                up2 = false;
            }else if(key == KeyEvent.VK_SHIFT){
                dagger2 = false;
            }else if(key == KeyEvent.VK_CONTROL){
                grenade2 = false;
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        TobyNMax game = new TobyNMax();
                
        // starts the game loop
        game.run();
    }
}

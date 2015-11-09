import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;


public class GameView {

    //width and height in 'blocks'
    private int width, height;

    //an array list to hold the rows in the game
    //the 'bottom' row is the first in the list
    //the top row is the last in the list
    private ArrayList<GameRow> rows = new ArrayList<GameRow>();

    //the score of the game
    int score;

    //the players current position
    private int playerPos;
    
    
    /**
     * 
     * Fill In Code Here
     * 
     */
    public GameView(int w, int h)
    {
        //set width and height in blocks

        
        //create 'height' amount of empty rows
        //and add to the rows list
        
        //initialize the player's position

    }

    public void draw(Graphics g)
    {
        //how big is each 'block'?
        int blockWidth = 800/width;
        int blockHeight = 600/height;

        //paint each row
        int y = 0;
        for(int i = rows.size() - 1; i >= 0; i--)
        {
            GameRow row = rows.get(i);
            drawRow(y,blockWidth,blockHeight,row,g);
            y += blockHeight;

        }
        drawPlayer(playerPos * blockWidth,blockHeight * (height-1),blockWidth ,blockHeight ,g);

    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    private void drawRow(int y, int blockWidth, int blockHeight, GameRow row, Graphics g)
    {
    	//if the row is empty we dont need to draw anything


        Image img = Toolkit.getDefaultToolkit().getImage("ut.png");
        
        if(!row.isEmpty())
        {
        	
        }
		
		
		
        //loop through the list
        //starting with the top row
        //ending with the bottom row
        
        //for each non empty row:
        	//draw the image on every block excluding the free block position
 
    }
    
    /**
     * 
     * Fill In Code Here
     * 
     */
    private void drawPlayer(int x, int y, int blockWidth, int blockHeight, Graphics g)
    {
        Image img = Toolkit.getDefaultToolkit().getImage("ou.png");
        
        //Draw the player using drawImage method in graphics
        //Hint: use null for ImageObserver
        g.drawImage(img,x, y, blockWidth, blockHeight, null);
    }

    public void pushDown()
    {
        //is the last row empty?
        if(rows.get(rows.size() - 1).isEmpty())
        {
            //create and add a new solid row
        	
            //where should the empty space be?
            Random random = new Random();
            int space = Math.abs(random.nextInt()) % width;
            rows.add(new GameRow(space));
        }
        else
        {
            //create and add a new empty row
            rows.add(new GameRow());
        }

        //remove off bottom row
        rows.remove(0);
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public void movePlayerRight()
    {
        //move the player's position to the right (players position + 1)
    	//wrap the player around to the left side
    	//of the screen if the player is too far
    	//right.
    	
    	//the player's valid positions are from 0-(width-1)

    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public void movePlayerLeft()
    {
    	//move the player's position to the left (players position - 1)
    	//wrap the player around to the right side
    	//of the screen if the player is too far
    	//left.
    	
    	//the player's valid positions are from 0-(width-1)


    }

    public boolean playerIsDead()
    {
        //is the row empty? if so still alive
        if(rows.get(0).isEmpty())
            return false;

        //is the player in the correct free space?
        if(playerPos == rows.get(0).getFreePosition())  
            return false;

        return true;                                    
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public int getPlayerPos()
    {
        return playerPos;
    }

    
    public boolean playerCanMove()
    {
        //the player can move if the bottom row is empty
        return rows.get(0).isEmpty();
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public void updateScore()
    {
    	score = 1;
    	//update the score by one
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public int getScore()
    {
    	return score;
    }
}

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JComponent {

    //width and height in pixels
    private int width, height;
    private GameView game;
    public GamePanel(int w, int h)
    {
        width = w;
        height = h;
        game = new GameView(8,6);
        this.setSize(800,600);
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public void paintComponent(Graphics g)
    {
        //draw the game
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public GameView getGame()
    {
    	return game;
    }
}


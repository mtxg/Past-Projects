import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame {

    private GamePanel panel;
    
    /**
     * 
     * Fill In Code Here
     * 
     */
    public GameFrame()
    {
        JFrame frame = new JFrame();
    	frame.setBackground(Color.WHITE);
        panel = new GamePanel(800,600);
        frame.add(panel);
        getContentPane().setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Sooner Squeeze");
        frame.pack();
        frame.setVisible(true);
        
        //Add a KeyListener that will move the player
        //left when the left arrow key is pressed
        //the key listener will also move the player
        //to the right when the right arrow is pressed
        //We will also need to repaint the frame when a key is pressed
        //NOTE: The player should only move if it 'Can Move'
        //NOTE: We are only concerned with the keyPressed method
        
        frame.addKeyListener(new KeyListener()
        {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
		            //Left arrow key code
		    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
		            //Right arrow key code
		    }

				repaint();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        }
        );
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public GamePanel getPanel()
    {
    	return panel;
    }
}

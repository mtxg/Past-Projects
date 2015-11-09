import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Driver extends JFrame{
    public static void main(String args[]) throws InterruptedException {
        GameFrame frame = new GameFrame();
        frame.add(new Panel());
        for(int i = 0; i < 100; i++)
        {
        	//only move the rows every second
            Thread.sleep(1000);
            //push the rows
            frame.getPanel().getGame().pushDown();
            //is my player dead?
            if(frame.getPanel().getGame().playerIsDead()) {
            	//player is dead game over
                JOptionPane.showMessageDialog(null,"Game Over!\nScore: " + frame.getPanel().getGame().getScore());
                System.exit(0);
            }
            else
                frame.getPanel().getGame().updateScore();
            
            //repaint the frame every second
            frame.repaint();
        }
        
       frame.setVisible(true);
        
        
        
        
        
        
        
        
       
    }
}
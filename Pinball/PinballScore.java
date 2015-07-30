 //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class PinballScore extends JPanel
{
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private JLabel label;
   private int score;
   public PinballScore()
   {
      label = new JLabel("Your score: " + 0);
      add(label);
   }
   public void update(int x)
   {
      score += x;
      label.setText("Your score: " + score);
   }
}
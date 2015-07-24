import javax.swing.JFrame;
public class PinballDriver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame ("Pinball");
      frame.setSize(600, 900);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PinballMap());
      frame.setVisible(true);
   }
}
// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument

//import swing components to use ui stuff
import javax.swing.*;

//Extension of JFrame as a result of import statement to produce frame
public class FixDebugFourteen1 extends JFrame
{
   public FixDebugFourteen1(int size)
   {
       //Parent call allows setting of title of frame
      super("This is my frame");

      //setSize = setting the size of the frame
      setSize(size, size * 2);

      //Sets to close after exiting
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   //Running application, what will run first:
   public static void main(String[] args)
   {
      FixDebugFourteen1 frame = new FixDebugFourteen1(200);
      //need to do something with the frame, i.e. make it visible
      frame.setVisible(true);
   } 
}

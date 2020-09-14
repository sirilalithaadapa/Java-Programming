//OlympicRingViewer.java - Siri Lalitha 

import javax.swing.JFrame;

public class OlympicRingViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 230;

      frame.setSize(300, 230);
      frame.setTitle("OlympicRingViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicRingComponent component = new OlympicRingComponent();
      frame.add(component);

      frame.setVisible(true);
  }
}

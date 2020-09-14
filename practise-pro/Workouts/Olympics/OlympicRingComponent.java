//OlympicRingComponent.java - Siri Lalitha

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;


public class OlympicRingComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
     Graphics2D g2 = (Graphics2D) g;

	 g.drawOval (1,0,40,40);
	 g.setColor(Color.YELLOW);

	 g.drawOval (21,20,40,40);
	 g.setColor(Color.BLACK);

	 g.drawOval (41,0,40,40);
	 g.setColor(Color.GREEN);

	 g.drawOval (61,20,40,40);
	 g.setColor(Color.RED);

	 g.drawOval (81,0,40,40);
	 g.setColor(Color.BLUE);
   }
}

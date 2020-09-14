//CheckerBoard.java - Siri Lalitha

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class CheckerBoard extends JFrame
{

   public void paint(Graphics g)
   {
      int row;
      int col;
      int x;
      int y;

      for ( row = 0;  row < 9;  row++ )
      {
         for ( col = 0;  col < 8;  col++)
         {
            x = col * 22;
            y = row * 22;
             if ( (row % 2) == (col % 2) )
               g.setColor(Color.WHITE);
            else
               g.setColor(Color.BLACK);

            g.fillRect(x, y, 22, 22);
         }
      }
   }

   public static void main(String args[]) {
        CheckerBoard check = new CheckerBoard();
        check.setTitle("CheckerBoard");
        check.setSize(180, 200);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}

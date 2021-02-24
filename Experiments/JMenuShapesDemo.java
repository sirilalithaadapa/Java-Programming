import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JMenuShapesDemo extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu draw;
    JMenuItem rect, line, oval;


    JMenuShapesDemo() {

        setLayout(null);
        mb = new JMenuBar();
        draw = new JMenu("Draw");
        draw.setMnemonic('d');
        mb.add(draw);
        rect = new JMenuItem("Rectangle");
        rect.addActionListener(this);
        rect.setMnemonic('r');
        draw.add(rect);

        oval = new JMenuItem("Oval");
        oval.addActionListener(this);
        oval.setMnemonic('o');
        draw.add(oval);

        line = new JMenuItem("Line");
        line.addActionListener(this);
        line.setMnemonic('l');
        draw.add(line);
        
        setJMenuBar(mb);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        Graphics g = getGraphics();
        if (str == "Rectangle")
            g.drawRect(100, 100, 50, 50);
        if (str == "Line")
            g.drawLine(300, 100, 400, 350);
        if (str == "Oval")
            g.drawOval(200, 100, 50, 50);
    }

    public static void main(String args[]) {
        JMenuShapesDemo f = new JMenuShapesDemo();
        f.setTitle("Drawing basic shapes");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

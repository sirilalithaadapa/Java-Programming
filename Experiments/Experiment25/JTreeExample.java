import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    JFrame f;

    TreeExample() {
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");

        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);

        DefaultMutableTreeNode serif = new DefaultMutableTreeNode("Serif");
        DefaultMutableTreeNode san_serif = new DefaultMutableTreeNode("San-Serif");
        font.add(serif);
        font.add(san_serif);


        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}

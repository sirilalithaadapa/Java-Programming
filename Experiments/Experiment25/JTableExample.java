import java.awt.*;
import javax.swing.*;

public class JTableExample extends JFrame {
    JTable table;

    public JTableExample() {
        setLayout(new FlowLayout());
        String[] columnNames = { "First name", "Last name", "Header" };
        Object[][] data = { { "Bill", "George", "Male" }, 
                            { "Marry", "Anna", "Female" },
                            { "Rick", "Bernard", "Male" } 
                          };
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(650, 75));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    public static void main(String args[]) {
        JTableExample t = new JTableExample();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(800, 400);
        t.setTitle("My Table");
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }
}

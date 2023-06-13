package leetcode.visualization.maximum_value_bounded_array;

import javax.swing.*;
import java.awt.*;

public class Visualisation {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Main");
        frame.setName("Main");
        frame.setFont(new Font(null,Font.ITALIC,20));
        frame.setSize(700,700);
        frame.setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JMenu menu = new JMenu();
        menu.setVisible(true);
        menu.setBackground(Color.orange);
        menu.setSize(700,50);
        frame.add(menu);



        JPanel panel = new JPanel();
        panel.setSize(100,100);
        panel.setBackground(Color.GREEN);
        panel.setVisible(true);
        panel.setLocation(0,600);


        JButton ok = new JButton("CHECK");
        ok.setSize(60,30);
        ok.setLocation(650, 600 );
        ok.setVisible(true);
        panel.add(ok);
        panel.add(menu);

        frame.add(panel);
        frame.setVisible(true);
    }
}

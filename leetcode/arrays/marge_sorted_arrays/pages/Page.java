package leetcode.arrays.marge_sorted_arrays.pages;

import leetcode.arrays.marge_sorted_arrays.pages.fields.FirstNums;
import leetcode.arrays.marge_sorted_arrays.pages.buttoms.MargeButton;
import leetcode.arrays.marge_sorted_arrays.pages.fields.LengthOfArray;
import leetcode.arrays.marge_sorted_arrays.pages.fields.RangeOfNums;
import leetcode.arrays.marge_sorted_arrays.pages.fields.SecondNums;

import javax.swing.*;
import java.awt.*;

public class Page extends JFrame {
        public Font numFont = new Font(Font.SERIF, 1, 35);

    public Page (){
        setTitle(" Sorted by Marge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0 , 600,600);
        setLocationRelativeTo(null);


        add(rangeOfNums());
        add(lengthOfArray());
        add(firstNums());
        add(secondNums());
        add(margeButton());


    //    setJMenuBar(menuBar);
        setSize(500,500);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(0,100,    00));
        setLayout(null);
        setVisible(true);
    }

    private JTextField firstNums(){
        return new FirstNums();
    }
    private JTextField secondNums(){
        return new SecondNums();
    }
    private JButton margeButton() {
        return  new MargeButton();
    }
    private JTextField lengthOfArray(){
        return  new LengthOfArray();
    }
    private JTextField rangeOfNums(){
        return  new RangeOfNums();
    }


}

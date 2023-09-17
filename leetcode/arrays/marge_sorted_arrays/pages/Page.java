package leetcode.arrays.marge_sorted_arrays.pages;

import leetcode.arrays.marge_sorted_arrays.pages.buttoms.GenerateArrays;
import leetcode.arrays.marge_sorted_arrays.pages.fields.*;
import leetcode.arrays.marge_sorted_arrays.pages.buttoms.MargeButton;

import javax.swing.*;
import java.awt.*;

public class Page extends JFrame {
        public Font numFont = new Font(Font.SERIF, 1, 35);

    public Page (){
        setTitle(" Sorted by Marge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0 , 600,600);
        setLocationRelativeTo(null);



        addComponentsToPage();



        setSize(500,500);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(0,100,    00));
        setLayout(null);
        setVisible(true);
    }
    private void addComponentsToPage (){
        add(rangeOfNums());
        add(lengthOfArray());
        add(firstNums());
        add(secondNums());
        add(margeButton());
        add(generateArrays());
        add(lengthOfArrayNum());
        add(rangeOfNumsNum());
        add(resultOfMarge());

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

    private JTextField lengthOfArrayNum(){
        return new LengthOfArrayNum();
    }
    private JTextField rangeOfNumsNum (){
        return new RangeOfNumsNum();
    }
    private JButton generateArrays () {
        return new GenerateArrays();
    }
    private JTextField resultOfMarge(){
        return  new ResultOfMarge();
    }


}

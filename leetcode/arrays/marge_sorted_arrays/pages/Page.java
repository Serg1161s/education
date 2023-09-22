package leetcode.arrays.marge_sorted_arrays.pages;

import leetcode.arrays.marge_sorted_arrays.pages.functions.SolutionSortedArrays;
import leetcode.arrays.marge_sorted_arrays.pages.buttoms.GenerateArraysButton;
import leetcode.arrays.marge_sorted_arrays.pages.fields.*;
import leetcode.arrays.marge_sorted_arrays.pages.buttoms.MargeButton;
import leetcode.arrays.marge_sorted_arrays.pages.functions.GenerateArrayRandom;
import leetcode.arrays.marge_sorted_arrays.pages.pages.FirstPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Page extends JFrame {
        private FirstPage firstPage = new FirstPage();
        private Font numFont = new Font(Font.SERIF, 1, 35);
        private FirstNums firstNums = new FirstNums();
        private SecondNums secondNums = new SecondNums();
        private MargeButton margeButton = new MargeButton();
        private LengthOfArray lengthOfArray = new LengthOfArray();
        private RangeOfNums rangeOfNums = new RangeOfNums();
        private LengthOfArrayNum lengthOfArrayNum = new LengthOfArrayNum();
        private RangeOfNumsNum rangeOfNumsNum = new RangeOfNumsNum();
        private GenerateArraysButton generateArrays = new GenerateArraysButton();
        private ResultOfMarge resultOfMarge = new ResultOfMarge();

        private SolutionSortedArrays solutionSortedArrays = new SolutionSortedArrays();


    public Page (){
       new FirstPage();
       addComponentsToPage();
       firstPage.setVisible(true);
    }



    private void addComponentsToPage (){
        firstPage.add(rangeOfNums);
        firstPage.add(lengthOfArray);
        firstPage.add(firstNums);
        firstPage.add(secondNums);
        firstPage.add(margeButton);
        firstPage.add(generateArrays);
        firstPage.add(lengthOfArrayNum);
        firstPage.add(rangeOfNumsNum);
        firstPage.add(resultOfMarge);
        generateArrays.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = Integer.valueOf(lengthOfArrayNum.getText());
                int range = Integer.valueOf(rangeOfNumsNum.getText());
                System.out.println("length: " + length);
                System.out.println(("range: " + range));
                firstNums.setText(Arrays.toString(GenerateArrayRandom.generateArrayRandom(length,range)));
                secondNums.setText(Arrays.toString(GenerateArrayRandom.generateArrayRandom(length,range)));
            }
        });
        margeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = Integer.valueOf(lengthOfArrayNum.getText());
                String textRes =  solutionSortedArrays.marge(firstNums.getText(),
                        secondNums.getText(),
                        length
                );
                resultOfMarge.setText(textRes);

            }
        });

    }






}

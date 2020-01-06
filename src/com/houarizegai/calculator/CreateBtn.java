package com.houarizegai.calculator;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

public abstract class CreateBtn{
	int wBtn = 80; // Width Button
    int hBtn = 70; // Height Button
    int marginX = 20;
    int marginY = 60;
    int[] x = {marginX, marginX + 90, 200, 290};
    int[] y = {marginY, marginY + 100, marginY + 180, marginY + 260, marginY + 340, marginY + 420};
    double val = 0;             // Storage the calculated Values
    char opt = ' ';             // Storage Operator
    boolean go = true, addWrite = true;
    
    Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
    JTextField inText = new JTextField();
}

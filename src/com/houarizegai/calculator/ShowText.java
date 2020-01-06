package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class ShowText extends CreateBtn{
	JTextField inText = new JTextField("0");
	
	public ShowText() {
		wBtn = 350;
	    inText.setBounds(x[0],y[0],wBtn,hBtn);
	    inText.setEditable(false);
	    inText.setBackground(Color.WHITE);
	    btnFont = new Font("Comic Sans MS", Font.PLAIN, 33);
	    inText.setFont(btnFont);
	}
	
}

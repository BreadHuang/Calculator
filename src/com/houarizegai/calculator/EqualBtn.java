package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;

public class EqualBtn extends CreateBtn{
	JButton btn = new JButton("=");
	
	public EqualBtn() {
		btn.setBounds(x[2],y[5],2*wBtn+10,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}

}

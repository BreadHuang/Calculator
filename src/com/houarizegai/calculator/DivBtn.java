package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;

public class DivBtn extends CreateBtn{
	JButton btn = new JButton("/");
	
	public DivBtn() {
		btn.setBounds(x[3],y[1],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
	
}

package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class CBtn extends CreateBtn{
	JButton btn = new JButton("C");
	
	public CBtn(){
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBounds(x[0],y[1],wBtn,hBtn);
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
	
}

package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;

public class AddBtn extends CreateBtn{
	JButton btn = new JButton("+");
	
	public AddBtn() {
		// TODO Auto-generated method stub
		btn.setBounds(x[3],y[4],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
		        
	}
	
	
		
}

package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;

public class Btn6 implements CreateButton{
	JButton btn = new JButton("6");
	
	public Btn6(){
		setEvt();
	}
	
	public void setEvt() {
		btn.setBounds(x[2],y[3],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
}

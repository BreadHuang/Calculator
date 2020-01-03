package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;

public class Btn1 implements CreateButton{
JButton btn = new JButton("1");
	
	public Btn1(){
		setEvt();
	}
	
	public void setEvt() {
		btn.setBounds(x[0],y[4],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
}

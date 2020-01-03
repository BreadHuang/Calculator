package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class Btn2 implements CreateButton{
	JButton btn = new JButton("2");
	
	public Btn2(){
		setEvt();
	}
	
	public void setEvt() {
		btn.setBounds(x[1],y[4],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
}

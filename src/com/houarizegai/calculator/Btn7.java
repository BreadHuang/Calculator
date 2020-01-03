package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class Btn7 implements CreateButton{
	JButton btn = new JButton("7");
	
	public Btn7(){
		setEvt();
	}
	
	public void setEvt() {
		btn.setBounds(x[0],y[2],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
}

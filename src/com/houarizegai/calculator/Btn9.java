package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class Btn9 implements CreateButton{
	JButton btn = new JButton("9");
	
	public Btn9(){
		setEvt();
	}
	
	public void setEvt() {
		btn.setBounds(x[2],y[2],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
}

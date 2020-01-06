package com.houarizegai.calculator;

import java.awt.Cursor;
import java.awt.Color;
import javax.swing.JButton;

public class BackBtn extends CreateBtn{
	JButton btn = new JButton("<-");
	
	public BackBtn(){
		//setEvt();
	}
	/*
	public void setEvt() {
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBounds(x[1],y[1],wBtn,hBtn);
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
	}
	*/
}

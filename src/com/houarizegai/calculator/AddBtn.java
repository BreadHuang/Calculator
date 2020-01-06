package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;

public class AddBtn extends CreateBtn{
	JButton btn = new JButton("+");
	
	public AddBtn(){
		
	}
	/*
	@Override
	public void setEvt(String txt, int x_axis, int y_axis) {
		// TODO Auto-generated method stub
		btn.setBounds(x[x_axis],y[y_axis],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
		
		btn.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = '+';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '+';
                }
        });
        
	}
	*/
	public void repaintFont() {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
    }
		
}

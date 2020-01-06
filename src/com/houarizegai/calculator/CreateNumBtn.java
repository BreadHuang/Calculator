package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JTextField;


public class CreateNumBtn extends CreateBtn{
	
	int i=0;
    
    JButton btn;
    public CreateNumBtn(JButton btn, String txt, int x_axis, int y_axis) {
    	btn.setText(txt);
		btn.setBounds(x[x_axis],y[y_axis],wBtn,hBtn);
		btn.setFont(btnFont);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(null);
		btn.setForeground(Color.BLACK);
		btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText(txt);
                } else {
                    inText.setText(inText.getText() + txt);
                }
            } else {
                inText.setText(txt);
                addWrite = true;
            }
            go = true;
        });
		this.btn = btn;
    	
	}
    
	public void repaintFont() {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
    }
	
	public JButton returnBtn() {
		return this.btn;
	}
	
}

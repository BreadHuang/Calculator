package com.houarizegai.calculator;

import java.awt.Font;
import javax.swing.JTextField;

public class calc {
	
	public double calc(JTextField inText, double x, String input, char opt) {
        inText.setFont(inText.getFont().deriveFont(Font.BOLD));
        double y = Double.parseDouble(input);
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        }
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return y;
    }
}

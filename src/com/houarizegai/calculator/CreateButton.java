package com.houarizegai.calculator;

import java.awt.Font;

public interface CreateButton{
	int wBtn = 80; // Width Button
    int hBtn = 70; // Height Button
    int marginX = 20;
    int marginY = 60;
    int[] x = {marginX, marginX + 90, 200, 290};
    int[] y = {marginY, marginY + 100, marginY + 180, marginY + 260, marginY + 340, marginY + 420};
    Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
    
	void setEvt();
}

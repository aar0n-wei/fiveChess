package com.demo;

import javax.swing.*;
import java.awt.*;

class MyJpanel extends JPanel {
    public static final int ROWS=15;
    public static final int COLS=15;
    public static final int GRID_SPAN=35;
    public static final int MARGIN=30;
    
    public MyJpanel(){
        setBackground(Color.orange);
        setSize(585,585);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        for (int i = 0; i <= ROWS; i++) {
            g.drawLine(MARGIN,MARGIN+i*GRID_SPAN,MARGIN+15*GRID_SPAN,MARGIN+i*GRID_SPAN);
        }
        for (int i = 0; i <= COLS; i++) {
            g.drawLine(MARGIN+i*GRID_SPAN,MARGIN,MARGIN+i*GRID_SPAN,MARGIN+15*GRID_SPAN);
        }

    }
}
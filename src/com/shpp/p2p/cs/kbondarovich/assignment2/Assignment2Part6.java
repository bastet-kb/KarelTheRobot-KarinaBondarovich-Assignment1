package com.shpp.p2p.cs.kbondarovich.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    //The number of elements of this caterpillar.
    private static final int PARTS_NUMBER = 12;
    //The diameter of each caterpillar element.
    private static final double DIAMETER = 90;
    //The shifts of each caterpillar part against the previous one.
    private static final double OVERLAY_X = 50;
    private static final double OVERLAY_Y = 36;
    //Defining more colors
    private static final Color GREEN_BRIGHT = new Color(100, 235, 15);
    private static final Color GREEN_GRASS = new Color(50, 180, 100);

    //The method receives the number of segments and draws the abstract caterpillar.
    public void run(){
        drawCaterpillar(PARTS_NUMBER);
    }
    //Draw the segment number i.
    private void drawCaterpillar (int partsNumber) {
        for (int i = 0; i < partsNumber; i++) {
            drawSegment(i);
        }
    }
    //This method receives the segment number i, identifies whether i is odd or even
    // and allocates it accordingly.
    private void drawSegment(int i) {
        double y = i % 2 != 0 ?  0 : OVERLAY_Y ;
            GOval o = new GOval(i*OVERLAY_X, y, DIAMETER, DIAMETER);
            o.setColor(GREEN_GRASS);
            o.setFilled(true);
            o.setFillColor(GREEN_BRIGHT);
            add(o);

        }

    }

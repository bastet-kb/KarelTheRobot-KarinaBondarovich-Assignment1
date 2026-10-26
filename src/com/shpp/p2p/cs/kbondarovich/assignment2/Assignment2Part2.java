package com.shpp.p2p.cs.kbondarovich.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    private static final int DIAMETER = 100;
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;

    public void run() {
        //Implement variables to make it easier to specify the parameters.
        int d = DIAMETER;
        int x = getWidth();
        int y = getHeight();

        //This method draws a circle with the indicated parameters (color, pos - x, y; and diameter size)
        add(createCircle(Color.BLACK, x * 0, y * 0, d));
        add(createCircle(Color.BLACK, x - d, y * 0, d));
        add(createCircle(Color.BLACK, x * 0, y - d, d));
        add(createCircle(Color.BLACK, x - d, y - d, d));

        //This method draws a circle with the indicated parameters (color, pos - x, y;
        // and equal width and height)
        //Positions each rectangle toward the center of the application windows.
        add(createRectangle(Color.WHITE, d / 2, d / 2, d / 2));
        add(createRectangle(Color.WHITE, x - d, d / 2, d / 2));
        add(createRectangle(Color.WHITE, d / 2, y - d, d / 2));
        add(createRectangle(Color.WHITE, x - d, y - d, d / 2));
    }
    //This method draws a rectangle with the indicated parameters (color, pos - x, y;
    // and equal width and height)
    private GRect createRectangle(Color color, int x, int y, int d) {
        GRect res = new GRect(x, y, d, d);
        res.setColor(color);
        fillObject(res, color);
        return res;
    }
    //This method draws a circle with the indicated parameters (color, pos - x, y; and diameter size)
    private GOval createCircle(Color color, int x, int y, int d) {
        GOval res = new GOval(x, y, d, d);
        res.setColor(color);
        fillObject(res, color);
        return res;
    }
    //This method fills the drawn oval.
    private void fillObject(GFillable obj, Color color) {
        obj.setFillColor(color);
        obj.setFilled(true);
    }


}
package com.shpp.p2p.cs.kbondarovich.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import javax.swing.*;
import java.awt.*;

public class Assignment2Part4 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;
    // Constants for a flag size
    public static final int FLAG_WIDTH = 450;
    public static final int FLAG_HEIGHT = 300;
    // Constants for new colors.
    private static final Color CARDINAL_RED = new Color(225, 0, 15);
    private static final Color NAVY_BLUE = new Color(0, 0, 145);

    public void run() {
        //Calculate a stripe width.
        double w = FLAG_WIDTH / 3;
        double h = FLAG_HEIGHT;

        //Calculate the flag pos against the application window.
        double x = (getWidth() / 2 - FLAG_WIDTH / 2);
        double y = getHeight() / 2 - FLAG_HEIGHT / 2;

        //This method draws a rectangle with the indicated parameters (color, pos - x, y; size w,h)
        //This calls create 3 vertical rectangles (flag stripes)
        add(createRectangle(NAVY_BLUE, x, y, w, h));
        add(createRectangle(Color.WHITE, x + w, y, w, h));
        add(createRectangle(CARDINAL_RED, x + w * 2, y, w, h));

        //Creating a sign for the country this flag belongs to.
        GLabel label = new GLabel("Flag of France");
        label.setFont(("Montserrat-30"));
        label.setColor(Color.BLACK);
        x = (getWidth() - label.getWidth());
        y = getHeight() - label.getAscent() / 3;
        add(label, x, y);
    }
    //This method draws a rectangle with the indicated parameters (pos - x, y; size w and h)
    private GRect createRectangle(Color color, double x, double y, double w, double h) {
        GRect res = new GRect(x, y, w, h);
        res.setColor(Color.LIGHT_GRAY);
        fillObject(res, color);
        return res;
    }
    //This method fills the drawn object.
    private void fillObject(GFillable obj, Color color) {
        obj.setFillColor(color);
        obj.setFilled(true);
    }
}
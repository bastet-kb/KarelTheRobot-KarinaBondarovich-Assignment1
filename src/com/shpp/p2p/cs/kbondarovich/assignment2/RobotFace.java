package com.shpp.p2p.cs.kbondarovich.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class RobotFace extends WindowProgram {
    // Constants for the robot head size
    private static final double HEAD_WIDTH = 350;
    private static final double HEAD_HEIGHT = 250;
    // Constants for the robot eye size
    private static final double EYE_RADIUS = 25;
    // Constants for the robot mouth size
    private static final double MOUTH_WIDTH = 75;
    private static final double MOUTH_HEIGHT = 30;

    public void run() {
        // Calculate the center of the application window.
        double centerX = getWidth() / 2.0;
        double centerY = getHeight() / 2.0;
        // Calculate the eye diameter.
        double diameter = EYE_RADIUS * 2;

        // This method creates a rectangle
        // With the indicated parameters it draws a head and a mouth.
        // The parameters center the face against the application and indicate the head size.
        add(createRectangle(Color.LIGHT_GRAY, centerX - HEAD_WIDTH / 2,
                                              centerY - HEAD_HEIGHT / 2,
                                            HEAD_WIDTH, HEAD_HEIGHT));
        // The parameters center the mouth against the head width and allocate it to the
        // lower 1/4 of the face and indicate the mouth size.
        add(createRectangle(Color.GRAY, centerX - MOUTH_WIDTH / 2,
                                        centerY + HEAD_HEIGHT / 4,
                                        MOUTH_WIDTH, MOUTH_HEIGHT));

        // As the eyes are allocated at 1/4 of both x and y - calculate 1/4 of the head size.
        double centerEyeX = HEAD_WIDTH / 4;
        double centerEyeY = HEAD_HEIGHT / 4;

        // This method creates an oval with indicated parameters
        // The parameters center the eye against the head width and height and indicate the eye diameter.
        add(drawEye(centerX - centerEyeX - diameter,
                    centerY - centerEyeY,
                    diameter));
        add(drawEye(centerX + centerEyeX,
                    centerY - centerEyeY,
                    diameter));
    }

    //This method draws a rectangle with the indicated parameters (pos - x, y; size w and h)
    private GRect createRectangle(Color color,double x, double y, double w, double h) {
        GRect res = new GRect(x, y, w, h);
        res.setColor(Color.BLACK);
        res.setFillColor(color);
        res.setFilled(true);
        return res;
    }

    //This method draws a circle with the indicated parameters (color, pos - x, y; and diameter size)
    private GOval drawEye(double x, double y, double d) {
        GOval res = new GOval(x, y, d, d);
        res.setColor(Color.BLACK);
        res.setFillColor(Color.DARK_GRAY);
        res.setFilled(true);
        return res;
    }
}
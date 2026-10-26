package com.shpp.p2p.cs.kbondarovich.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        drawTheGrid (NUM_ROWS, NUM_COLS);
    }

    //Calculating the final size of the grid.
    double gridWidth = (NUM_COLS * BOX_SIZE) + ((NUM_COLS-1) * BOX_SPACING);
    double gridHeight = (NUM_ROWS * BOX_SIZE) + ((NUM_ROWS-1) * BOX_SPACING);

    //This method draws the grid row by row.
    // It receives the number of rows and columns from the constants NUM_ROWS and NUM_COLS.
    @SuppressWarnings("SameParameterValue")
    private void drawTheGrid(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            //Drow row number i.
            drawGridRow (i, columns );
        }
    }
    //This method draws the row of rectangles.
    //// It receives the row number and the quantity of grid items in that row (columns)
    private void drawGridRow (int rowNumber, int columns) {
        for (int i = 0; i < columns; i++) {
            //Drow grid item (rectangle) number i in the row.
            drawGridItem(rowNumber, i);
        }
    }
    // This method draws a rectangle at the position calculated from its row and column.
    private void drawGridItem(int rowNumber, int colNumber) {
        GRect r = new GRect(
                // Calculate the position of each cell to center the grid.
                (getWidth()/2 - (gridWidth)/2) + (colNumber * (BOX_SIZE + BOX_SPACING)),
                (getHeight()/2 - (gridHeight)/2)+(rowNumber * ( BOX_SIZE + BOX_SPACING)),
                BOX_SIZE, BOX_SIZE);

        r.setFilled(true);
        r.setFillColor(Color.BLACK);
        r.setColor(Color.BLACK);
        add(r);
    }
}


package com.shpp.p2p.cs.kbondarovich.assignment2;

import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment2Part1 extends ConsoleProgram {

    public void run() {
        // Ask the user to enter 3 numbers
        double a = readDouble( "Please enter a" );
        double b = readDouble( "Please enter b" );
        double c = readDouble( "Please enter c" );

        // Check whether we can use the discriminant
        if (a == 0) {

            if (b == 0 && c == 0) {
                println ("There are infinitely many solutions");
            }
            //Check if we can solve a linear equations
            else { println ( b != 0 ? "There is one root: " + (-(c / b))
            : "There are no real roots");
            }
        }
        // Calculate the discriminant and find the roots based on its value
        else {
            double discriminant = (b * b)- (4 * a * c);

            if (discriminant > 0) {
                double x1 = (- b  + (Math.sqrt(discriminant)) )
                        / ( a * 2);
                double x2 = (- b  - (Math.sqrt(discriminant)) )
                        / ( a * 2);
                println ("There are two roots: " + x1 + " and " + x2 );
            }

            else if (discriminant == 0)  {
                double x = ((- b ) / ( a * 2));
                println ("There is one root: " + x );
            }
            else  {
                println ("There are no real roots");
            }
        }
    }
}
package com.shpp.p2p.cs.kbondarovich.assignment2;

import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment2Part8 extends ConsoleProgram {

    public void run() {
        // Ask the user to enter a number
        int inputNumber = readInt( "Please enter a number" );
        //Check every number from 0 till the number entered by the user
        for (int i = 0; i < inputNumber; i++) {
            //Checking if it is a Buzz number
            if ((i % 3 ==0 && i % 5 ==0 )) {
                println ("Buzz");}
            //Checking if it is a Fizz number
            else if (i % 3 ==0) {
                println ("Fizz");
            }
            //Checking if it is a Bazz number
            else if (i % 5 ==0) {
                println ("Bazz");
            }
            //Output the numbers that do not meet any of the above conditions
            else { println (i);}
        }
       }
    }


package com.company;//uses the scanner class.
import java.util.*;
public class Main {
//This program demonstrates a case insensitive string comparison.
    public static void main(String[] args) {
	// write your code here
        System.out.println("This program shows if the user has entered Thee Secrete word into the program.");

        String input;//this is the variable to hold the user input.
        Scanner cin = new Scanner(System.in);//This is the scanner object we will use to collect the user Input

        //Prompt the user to enter the Keyword.
        System.out.println("Please enter the keyword.");
        input = cin.next();

        if(input.equalsIgnoreCase("DEGREE")){
            System.out.println("You Now have a Degree!!!");

        }else {
            
            System.out.println("Please Keep Trying!");
        }
    }
}

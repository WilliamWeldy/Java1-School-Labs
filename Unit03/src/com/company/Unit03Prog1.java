package com.company;

import java.util.Scanner;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program prints out all the characters between the char variables "c1" and "c2" inclusive.
 * Due: 9/16/2019
 * @author William Weldy
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit03Prog1 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String inputString; //handles the user input

	System.out.print("Please enter two characters: ");
	inputString = input.nextLine(); //gets the input

	inputString = inputString.toLowerCase(); //input is converted to lower case letters
	int charIndex = 1;
	char c1 = inputString.charAt(0); //the first character in the input is converted
	char c2 = inputString.charAt(1); //the second character in the input is converted
	while(Character.isWhitespace(c2)) { //if c2 is actually whitespace then it'll keep checking until it does not find whitespace anymore
		charIndex++;
		c2 = inputString.charAt(charIndex);
	}
	printChars(c1, c2);
	}

    public static void printChars(char c1, char c2) {
    	int repeat = 1;

    	if(c1 > c2) { //if c1 is farther up in the character list, this method won't work, so this logical structure will put them in a more calculable order
    	    char temp;

    	    temp = c1;
    	    c1 = c2;
    	    c2 = temp;
        }
		System.out.println("Printing all characters between " + c1 + " and " + c2);
		for(int charDifference = (c2-c1) ; charDifference >= 0 ; charDifference--) { //This loop checks the difference between characters and decrements each iteration.
			if(repeat==10) { //After the 10th time, move to the next line
				repeat = 1; //reset the repeat counter
				System.out.println(c1); //next letter prints on the next line
			}
			else { //if the repeat counter isn't at 10 then print everything as normal
				System.out.print(c1 + " ");
			}
			c1++;
			repeat++;
		}
    }

}

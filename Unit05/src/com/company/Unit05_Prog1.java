package com.company;

import java.util.Scanner;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program reads the input youtype out in the command prompt and returns a count of Lowercase Letters used in the input.
 * Due: 10/8/2019
 * @author William Weldy
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit05_Prog1 {

    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("This program cannot work without an argument! Please enter in a string to calculate the amount of lower case letters that're in it.");
            System.exit(1);
        }
        int lowerCaseCount = 0;

        String argsConverted = args[0];
        char[] chars = argsConverted.toCharArray();
        for (int i = 0 ; i < chars.length ; i++ )
            if(Character.isLowerCase(chars[i]) == true)
                lowerCaseCount++;
        System.out.println("The number of lowercase letters is " + lowerCaseCount);
    }
}


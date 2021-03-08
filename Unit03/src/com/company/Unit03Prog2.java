package com.company;

import java.util.Scanner;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program reads 10 numbers from user input and displays only the distinct numbers, non-distinct numbers are omitted.
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

public class Unit03Prog2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputValue;
        int numValue;

        int[] inputArray = new int[10];
        int distinctNum = 10;

        for(int i = 0 ; i < inputArray.length ; i++) { //this loop block will gather all the values and put them into the inputArray
            System.out.print("Enter an integer: ");
            inputValue = input.nextLine();
            numValue = Integer.parseInt(inputValue);
            inputArray[i] = numValue;
        }
        System.out.println("The number of distinctNum values is " + distinctNum);
        for(int k = 0 ; k < distinctNum ; k++) { //this loop block will gather all the values and put them into the inputArray
            System.out.print(inputArray[k] + " ");
        }
    }
}

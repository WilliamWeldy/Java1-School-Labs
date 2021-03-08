package com.company;

import java.util.Scanner;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program will prompt the user to enter a number ten different times and then return the total of all ten of the numbers.
 * Due: 9/8/2019
 * @author William Weldy
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit02Prog2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        String userNumber;

        for(int cnt = 1 ; cnt <= 10 ; cnt++) {
            System.out.print("Please enter a number: ");
            userNumber = input.nextLine();
            total += Integer.parseInt(userNumber);
        }
        System.out.print("The total is: " + total);
    }

}

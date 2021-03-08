package com.company;

import java.util.Scanner;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program will take the number of words in an ad and charge them according to the pricing by the "Daily Gazette" newspaper
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

public class Unit02Prog1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String category;
        String numWords;
        double calcWords;
        double price = 0.0;

        System.out.print("Welcome to the Daily Gazette's classified ad program! Please enter in your name: "); //Gets the customer's name
        name = input.nextLine();

        System.out.print("What category is the advertisement? Enter here: "); //Gets the ad's category
        category = input.nextLine();

        System.out.print("How many words are there in the advertisement? Enter here: "); //Gets the word count in the ad
        numWords = input.nextLine();

        System.out.println("Calculating...\n "); //Calculating for the number of words
        calcWords = Double.parseDouble(numWords);
        if(calcWords > 50.0) {
            price = (((calcWords-50.0) * 0.08) + 5.00); //This subtracts how many words there are from 50, so 50 more words aren't added back in if it's already over 50.
            price += 50.0;
        }
        else {
            price = calcWords * 0.1;
        }
        System.out.println("Customer: " + name);
        System.out.println("Placed an ad in category: " + category);
        System.out.println("Ad length is " + numWords + " words, at a price of $" + String.format("%.2f", price));
    }

}

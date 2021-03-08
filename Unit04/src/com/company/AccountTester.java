package com.company;

import java.util.Scanner;
import com.company.Account;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: J. Mamo
 * Description: This java file creates a class, based off the UML diagram's specification, that tests the account class.
 * Due: 9/24/2019
 * @author William Weldy
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class AccountTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String accountNumber;
        String accountType;
        String cardNumber;
        String expireDate;


        //Prompts the user for information to create an account object
        System.out.println("Welcome to the account creation program!");
        System.out.print("Enter in the account number: ");
        accountNumber = input.nextLine();
        System.out.print("Enter in the type of account: ");
        accountType = input.nextLine();
        System.out.print("Enter in the card number: ");
        cardNumber = input.nextLine();
        System.out.print("Enter in the expiration date: ");
        expireDate = input.nextLine();
        System.out.println(); //Gives it a space for more readability
            Account accountMultiArg = new Account(accountNumber, accountType, cardNumber, expireDate); //This class creates an account object testing its multi-arg constructor

        //Prompts the user again for a new account object, accessing data in a different way
        System.out.println("Let's do it one more time!");
        System.out.print("Enter in the account number: ");
        accountNumber = input.nextLine();
        System.out.print("Enter in the type of account: ");
        accountType = input.nextLine();
        System.out.print("Enter in the card number: ");
        cardNumber = input.nextLine();
        System.out.print("Enter in the expiration date: ");
        expireDate = input.nextLine();
        System.out.println(); //Gives it a space again for more readability
            Account accountGetSet = new Account();
            accountGetSet.getAccountNumber();
            accountGetSet.setAccountNumber(accountNumber);
            accountGetSet.getAccountType();
            accountGetSet.setAccountType(accountType);
            accountGetSet.getCardNumber();
            accountGetSet.setCardNumber(cardNumber);
            accountGetSet.getExpireDate();
            accountGetSet.setExpireDate(expireDate);
        System.out.println("Thank you very much for using my program! Have a nice day!\n \n"); //Exit message, the '\n' portions will create space if you rerun the program
    }
}

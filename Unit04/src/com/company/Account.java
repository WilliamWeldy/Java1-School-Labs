package com.company;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: J. Mamo
 * Description: This java file creates a class, based off the UML diagram's specification, that holds all the information for an account.
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

public class Account {
    private String acctNum;
    private String acctType;
    private String cardNum;
    private String expirationDate;

    Account() { //Empty Constructor

    }
    Account(String cardAccountNumber, String cardAccountType, String cardNumber, String cardExpireDate) { //If created with parameters passed into the constructor, it will feed you back what you put into it
        System.out.println("The account details are as follows:");
        System.out.println(cardAccountNumber);
        System.out.println(cardAccountType);
        System.out.println(cardNumber);
        System.out.println(cardExpireDate);
        System.out.println(); //Gives it a space for more readability
    }


    //get+set for acctNum string
    public String getAccountNumber() { //Account Number accessor
        return acctNum;
    }
    public void setAccountNumber(String setAcctNum) { //Account Number mutator
        System.out.println("The account number is set to: " + setAcctNum);
    }

    //get+set for acctType string
    public String getAccountType() { //Account Type accessor
        return acctType;
    }
    public void setAccountType(String setAcctType) { //Account Type mutator
        System.out.println("The account type is set to: " + setAcctType);
    }

    //get+set for cardNum string
    public String getCardNumber() { //Card number accessor
        return cardNum;
    }
    public void setCardNumber(String setCardNum) { //Card number mutator
        System.out.println("The card number is set to: " + setCardNum);
    }

    //get+set for expirationDate string
    public String getExpireDate() { //Expiration date accessor
        return expirationDate;
    }
    public void setExpireDate(String setDate) { //Expiration date mutator
        System.out.println("The expiration date is set to: " + setDate);
    }
}

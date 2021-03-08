package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program tests a class called MyInteger and all of the methods specified in the UML Diagram
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

public class MyIntegerTester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter in test value: ");
        int value = Integer.parseInt(input.nextLine());
        MyInteger testInt = new MyInteger(value);
        testInt.isPrime(7);
    }
}

class MyInteger {
    private int value; //An int data field named value that stores the int value represented by this object

    MyInteger(int intValue) { //A constructor that creates a MyInteger object with the passed int value
        System.out.println(intValue + " was passed into the MyInteger constructor.");
        value = intValue;
    }

    public int getNumber(int number) { //A get method that returns the int value
        number = value;
        return number;
    }


    //The instance methods isEven(), isOdd(), and isPrime() that return true if the value in
    //this object is even, odd, or prime, respectively
    public boolean isEven(int num) {
        if (num%2==0)
            return true;
        else return false;
    }
    public boolean isOdd(int num) {
        if (num%2!=0)
            return true;
        else return false;
    }
    public boolean isPrime(int num) {
        int pNum = abs(num);

        if (pNum == 0 || pNum == 1) //0 and 1 are not prime numbers
            return false;
        else if (pNum == 2 || pNum == 3) //2 and 3 are prime numbers
            return true;
        for (int i = 2; i <= pNum / 2; ++i) //for numbers 4 to the maximum limit of the integer primitive types
            if (pNum % i == 0)
                return false;
        return true;
    }


    //The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the
    //specified value is even, odd, or prime, respectively
    public static boolean isEvenStatic(int staticNum) {
        if (staticNum%2==0)
             return true;
        else return false;
    }
    public static boolean isOddStatic(int staticNum) {
        if (staticNum%2!=0)
             return true;
        else return false;
    }
    public static boolean isPrimeStatic(int staticNum) {
        int pNum = abs(staticNum);

        if (pNum == 0 || pNum == 1) //0 and 1 are not prime numbers
            return false;
        else if (pNum == 2 || pNum == 3) //2 and 3 are prime numbers
            return true;
        for (int i = 2; i <= pNum / 2; ++i) //for numbers 4 to the maximum limit of the integer primitive types
            if (pNum % i == 0)
                return false;
        return true;
    }

    //The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that
    //return true if the specified value is even, odd, or prime, respectively.
    public static boolean isMyIntegerEven(MyInteger intNum) {
        return false;
    }
    public static boolean isMyIntegerOdd(MyInteger intNum) {
        return false;
    }
    public static boolean isMyIntegerPrime(MyInteger intNum) {
        return false;
    }

    //The instance methods equals(int) and equals(MyInteger) that return true if the value in
    //this object is equal to the specified value
    public boolean equals(int num) {
        if(value==num) return true;
        else return false;
    }
    public boolean equals(MyInteger intNum) {
        //if(MyInteger.getNumber()==intNum) return true;
        return false;
    }

    //A static method parseInt(char[]) that converts an array of numeric characters to an int value
    public static int parseInt(char[] characterArray) {
        int number = 0;
        char[] parsedArray = characterArray;

        for(int i = 0 ; i < characterArray.length ; i++) {
            if(Character.isDigit(characterArray[i])) parsedArray[i] = characterArray[i];
            else parsedArray[i] = '\u00A0';
        }

        String arrayToString = String.valueOf(parsedArray);
        arrayToString.trim();
        number = Integer.parseInt(arrayToString);

        return number;
    }

    //A static method parseInt(String) that converts a string into an int value
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
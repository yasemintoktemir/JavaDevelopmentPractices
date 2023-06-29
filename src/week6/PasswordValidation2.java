package week6;

import java.util.Scanner;

public class PasswordValidation2 {

    public static void main(String[] args) {

        final int NumberOfUppercase = 1;
        final int NumberOfLowercase = 1;
        final int NumberOfDigits = 1;
        final int NumberOfLetters = 6;
        final int NumberOfSpecialCharacters = 1;

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0;
        int SpecialCharactersCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password \n The password should have at least: \n\t One uppercase, one lowercase and one digit");

        String input = in.nextLine();
        int inputLen = input.length();

        // Character:
        for (int i = 0; i < inputLen; i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isDigit(ch))
                digitCount++;
        }

        if (upperCount >= NumberOfUppercase
                && lowerCount >= NumberOfLowercase
                && digitCount >= NumberOfDigits)
            System.out.println("Valid password");
        else{
            System.out.println("The password did not have enough of the following: ");
            if (upperCount < NumberOfUppercase)
                System.out.println("uppercase letters");
            if (lowerCount < NumberOfLowercase)
                System.out.println("lowercase letters");
            if (digitCount < NumberOfDigits)
                System.out.println("digits");



        }

    }

}

/*
2.	String_PasswordValidation
    Write a return method that can verify if a password is valid or not.

    requirements:
    1.	Password MUST be at least 6 characters and should not contain spaces
    2.	Password should at least contain one upper-case letter
    3.	Password should at least contain one lowercase letter
    4.	Password should at least contain one special character
    5.	Password should at least contain a digit

    if all requirements above are met, the method returns true, otherwise returns false
 */
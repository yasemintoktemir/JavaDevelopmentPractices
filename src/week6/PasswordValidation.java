package week6;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        final int NumberOfCharacters = 6;
        final int Spaces = 0;
        final int NumberOfUppercase = 1;
        final int NumberOfLowercase = 1;
        final int NumberOfSpecialCharacters = 1;
        final int NumberOfDigits = 1;

        int charactersCount = 0;
        int spacesCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;
        int digitCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: \n\t(at least 6 characters with no spaces, 1 uppercase, 1 lowercase," +
                " 1 special character and one digit)");

        String input = in.nextLine();
        int inputLen = input.length();

        charactersCount += inputLen;

        for (int i = 0; i < inputLen; i++) {
            char ch = input.charAt(i);
            if (Character.isWhitespace(ch))
                spacesCount++;
            else if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isDigit(ch))
                digitCount++;
            else
                specialCount++;
        }

        if (charactersCount >= NumberOfCharacters
                && spacesCount < Spaces
                && upperCount >= NumberOfUppercase
                && lowerCount >= NumberOfLowercase
                && digitCount >= NumberOfDigits
                && specialCount >= NumberOfSpecialCharacters)
            System.out.println("Valid password");
        else{
            System.out.println("Invalid password for the followings: ");

            if (charactersCount < NumberOfCharacters)
                System.out.println("\tPasswordThe password did not have enough characters");
            if (upperCount < NumberOfUppercase)
                System.out.println("\tThe password should have at least 1 uppercase letter");
            if (lowerCount < NumberOfLowercase)
                System.out.println("\tThe password should have at least 1 lowercase letter");
            if (specialCount < NumberOfSpecialCharacters)
                System.out.println("\tThe password should have at least 1 Special character");
            if (digitCount < NumberOfDigits)
                System.out.println("\tThe password should have at least 1 digit");
            if (spacesCount > Spaces)
                System.out.println("\tThe password should have no spaces");
        }

    }

}



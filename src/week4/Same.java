package week4;

import java.util.Arrays;

public class Same {

    public static boolean same(String str1, String str2) {

        char[] charString1 = str1.toCharArray();    // convert str1 to a sequence of characters + store in chartString1 array

        /*
        System.out.println(charString1);                // abc

        for (int i = 0; i < charString1.length; i++) {
            System.out.println(charString1[i]);         // a
                                                        // b
                                                        // c
        }
        */

        char[] charString2 = str2.toCharArray();
        Arrays.sort(charString1);                           // sort the characters in charString1 array
        Arrays.sort(charString2);

        return Arrays.equals(charString1, charString2);     // return the comparison of the two arrays
    }

    public static void main(String[] args) {

        // using scanner
        /*
        System.out.println("Enter 2 same length strings:");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        System.out.println(same(str1, str2));
        */

        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }

}

/*
1.	String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:
Same ("abc", "cab"); => true
Same ("abc", "abb"); => false
 */

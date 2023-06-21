package week4;

public class RemoveDup {

    public static void removeDup(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++) {               //i: index numbers of str

            char each = str.charAt(i);                         // each character of the String str

            if (!result.contains("" + each)) {                 // if the string result does not contain the character of string str yet
                result += each;                                  // then the character is added to string result
            }

        }
        System.out.println(result);                             // print the given string without duplicated
    }


    public static void main(String[] args){

        removeDup("AAABBBCCC");                             // calling the method removeDup

    }

}

/*
2.	String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:
removeDup("AAABBBCCC") ==> ABC
*/
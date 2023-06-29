package week6;

public class SumOfAllDigits {

    public static void main(String[] args)
    {
        String str = "12 java 5 apple 3";
        SumOfAllDigits(str);
    }

    public static void SumOfAllDigits(String str)
    {
        String temp = "";                           // Temporary holding string
        int sum = 0;                                // initial sum of all digits in the string

        for (int i = 0; i < str.length(); i++) {    // find each character in a given string
            char ch = str.charAt(i);

            if (Character.isDigit(ch))              // verify if each character is a digit
                temp += ch;                         // update temp: add the digit

            else {                                  // if current character is an alphabet
                sum += Integer.parseInt(temp);      // convert the digits found in the given string and add it to the sum
                temp = "0";                         // reset temporary string to empty
            }
        }
        System.out.println(sum + Integer.parseInt(temp));
    }

}


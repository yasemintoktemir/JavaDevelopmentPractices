package week4;

public class FrequencyOfChars {

    public static void FrequencyOfChars(String str){

            String s = "str";                              // AAABBCDD
            String result = "";                            // A3B2C1D2

            for (int j = 0; j < str.length(); j++) {       // j = 0  --> first character of the string str 'A'

                char ch = str.charAt(j);                   // each character from string
                int count = 0;

                // to find the frequency of each character
                for (int i = 0; i < str.length(); i++) {   // i = 0 first character of str 'A'

                    char each = str.charAt(i);             // each character of str  (A, A, A, B, B, C, D, D)
                    if(ch == each){                        // find a match while iterating
                        count++;                           // if a matching character is found --> add to counter
                    }
                }

                if(result.contains(""+ch)){                // if result contains the found matching character
                    continue;                                   // --> ignore and continue with the next match
                }

                result += ch;                              // update the result with the duplicate character
                result += count;                           // update the result with the counter value
            }

            System.out.println(result);                    // print the result

        }


        public static void main(String[] args) {

            FrequencyOfChars("AAABBCDD");

        }
    }



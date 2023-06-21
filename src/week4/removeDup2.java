package week4;

public class removeDup2{

    public static void removeDup(char str[], int len)   // str = [A, A, A, B, B, B, C, C, C]    len/length = 9   char[9]
    {
        String NoDupStr = "";
        int i , j;
        for(i = 0 ; i < len ; i++){                     // first loop starts with i = 0         | second loop i = 1
            for(j = 0 ; j < i ; j++){                   // first loop starts with j = 0         | second loop j = 0
                if(str[i] == str[j]){                   // ignored on the first loop (j < i is false)
                                                            // Str[i] == str[j] == str[0] = A | Str[1] == str[0] = A
                                                            // --> repeated/duplicate character
                break;                                  // breaking here because this character is already
                }                                           // added to our answer because it was found earlier

            }
            if(j == i){                                 // j == i
                NoDupStr += str[i];                         // first character A is added to/update NoDupStr string
                                                        // j != 1
                                                            // no character is added
            }
        }
        System.out.print(NoDupStr);                     // print the modified given string after removing the duplicates
    }


    public static void main(String[] args)
    {
        char str[] = "AAABBBCCC".toCharArray();       // the given string is converted to character array
        int len = str.length;                         // the given string length
        removeDup(str, len);                          // calling the method removeDup()
    }
}

/*
2.	String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:
removeDup("AAABBBCCC") ==> ABC
 */
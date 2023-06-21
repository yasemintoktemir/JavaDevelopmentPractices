package week5;

public class Unique {

    public static void Unique(String str) {

        String s = "str";                           // AAABBBCCCDEF
        String unique = "";                         // DEF

        for (int i = 0; i < str.length(); i++) {    // i: index numbers of str
            char each = str.charAt(i);              // each character of the string
            //System.out.print(each);
            //System.out.print(" "+str.indexOf(each));
            //System.out.print(" "+str.lastIndexOf(each)+"\n");

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }
        System.out.println(unique);
    }

    public static void main (String[] args){
        Unique("AAABBBCCCDEF");
    }

}

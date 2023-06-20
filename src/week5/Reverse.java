package week5;

public class Reverse {

    public static void Reverse(String str){

        String s = "str";                                   // ABCD
        String reversed_str = "";                           // DCBA

        for (int i = 0; i < str.length(); i++) {
            reversed_str = str.charAt(i) + reversed_str;
            //System.out.println(reversed_str);             // A, BA, CBA, DCBA
                                                            // values of reversed_str after each loop
        }

        System.out.println(reversed_str);
    }

    public static void main(String[] args) {

        Reverse("ABCD");
    }
}

package src.week3;

public class Reverse {
    public static void main(String[] args) {
        String name = "Group Aestra";
        String result =reverse(name);

        System.out.println(result);
    }

    public static String reverse(String str){
        String reverse ="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse +=str.charAt(i);
        }
        return reverse;
    }


}



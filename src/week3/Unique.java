package src.week3;

public class Unique {
    public static void main(String[] args) {
        String name = "abcabcef";
        uniqueMethod(name);
    }

    public static void uniqueMethod(String uniqueStr) {

        for (int i = 0; i < uniqueStr.length(); i++) {
            char currentChar = uniqueStr.charAt(i);
            boolean isUnique = true;


            for (int j = 0; j < uniqueStr.length(); j++) {
                if (i != j && currentChar == uniqueStr.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(currentChar);
            }

        }

    }

}

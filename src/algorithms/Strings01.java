package algorithms;

import java.util.List;

public class Strings01 {

    public static void main(String[] args) {
        String str = "Hello, World!";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }


    public static char[] convertToChar(String str) {
         return str.toCharArray();
    }

}

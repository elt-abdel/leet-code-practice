import java.util.Arrays;
import java.util.HashSet;

// implement an algorithm to determine if a string has all unique characters. What if you can not use additonal data structres?

public class UniqueCharString {
    public static void main(String[] args) {
        String test = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isUniqueChar(test));
    }

    // Time: o(n); Space: o(n);
    // static boolean isUniqueChar(String str){
    //     if(str.length() > 128) return false; //ASCII

    //     HashSet<Character> hs = new HashSet<>();

    //     for (int i = 0; i < str.length(); i++) {
    //         if (hs.contains(str.charAt(i))) {
    //             return false;
    //         } else {
    //             hs.add(str.charAt(i));
    //         }
    //     }
    //     return true;
    // }

    // Time: 0(n) Space:o(1)
    static boolean isUniqueChar(String str){
        if(str.length() > 128) return false; //ASCII

        boolean[] char_set = new boolean [128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            } else {
                char_set[val] = true;
            }
        }
        return true;
    }
}

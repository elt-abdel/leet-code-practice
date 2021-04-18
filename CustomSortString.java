import java.util.Arrays;
import java.util.HashSet;

/**
 * CustomSortString
 */
public class CustomSortString {

    public static void main(String[] args) {
        String s = "dogcat";
        String t = "dogygkitty";
        String rtn = "doggttykiy";
        System.out.println(rtn.equals(customSortString(s,t)));
    }

    public static String customSortString(String S, String T) {
        StringBuilder bob = new StringBuilder();
        HashSet<Character> setty = new HashSet<>();

        int[] bucket = new int[26];
        for (char c : T.toCharArray()) {
            bucket[c - 'a']++;
        }

        System.out.println(Arrays.toString(bucket));

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < T.length(); j++) {
                if (S.charAt(i) == T.charAt(j)) {
                    bob.append(T.charAt(j));
                }
            }
            setty.add(S.charAt(i));
        }

        for (int i = 0; i < T.length(); i++) {
            if (!setty.contains(T.charAt(i))) {
                bob.append(T.charAt(i));
            }
        }

        return bob.toString();
    }

}
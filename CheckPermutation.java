// Given two string, write a method to decide if one is a permutation(Anagram) of the other

public class CheckPermutation {
    public static void main(String[] args) {
        
        String test = "hello world";

        String test2 = "hello world";
        
        System.out.println(permutation(test, test2));        
    }

    static boolean permutation (String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] values = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            values[val] += 1;
        }
        for (int i = 0; i < t.length(); i++) {
            int val = t.charAt(i);
            values[val] -= 1;
            if (values[val] < 0) {
                return false;                
            }
        }
        return true;
    }
}

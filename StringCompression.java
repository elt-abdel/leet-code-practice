public class StringCompression {
    public static void main(String[] args) {
        String str = "aa";
		System.out.println(str);
		System.out.println(compress(str));
        String str2 = "aaa";
		System.out.println(str2);
		System.out.println(compress(str2));
    }

    public static String compress(String str){
        StringBuilder compressesd = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            /* If next character is different than current, append this char to result*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressesd.append(str.charAt(i));
                compressesd.append(countConsecutive);
                countConsecutive = 0;
            } 
        }
        return compressesd.length() < str.length() ? compressesd.toString() : str;
    }
}

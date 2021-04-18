// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

public class GoalParserInterpretation {
    public static void main(String[] args) {

        String [] test = {"G()(al)", "G()()()()(al)", "(al)G(al)()()G"};
        for (String string : test) {
            System.out.println(string + " " + interpret(string));
        }
    }

    public static String interpret(String command) {
        StringBuilder bob = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                bob.append("G");
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                bob.append("o");
                i++;
            } else {
                bob.append("al");
                i += 3;
            }
        }
        return bob.toString();
    }
}
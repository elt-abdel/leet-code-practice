public class ValidParenthesisString {
	public static boolean checkValidString(String s) {
		int left = 0;
		int right = 0;
		int special = 0;
		int negative = 0;

		// example 1 || s = "()" = left 1; right 1; special 0;
		// example 2 || s = "(*)" = left 1; right 1; special 1;
		// example 3 || s = "(*))" = left 1; right 2; special 1;
		// example 4 || s = ")()(" = left 2: right 2; special 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				left += 1;
				negative += 1;
			} else if (s.charAt(i) == ')') {
				right += 1;
				negative -= 1;
			} else {
				special += 1;
				negative += 1;
			}
			if (negative < 0) {
				return false;
			}
		}

		System.out.println("Left: " + left + " Right: " + right + " Neg: " + negative + " Sp: " + special);

		if (left == right) {
			return true;
		} else if (left < right) {
			if (left + special >= right) {
				return true;
			}

		} else if (right < left) {
			if (right + special >= left) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String test = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
		checkValidString(test); // should return false but my solution returns true
		System.out.println("should return false but my solution returns true.\nCheckValidString(test):  "
				+ checkValidString(test));
	}

}
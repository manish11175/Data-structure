package recursion.questionanswerapproach;

public class InvalidBracket {

	public static void main(String[] args) {
		remove("()()())", "", 0);
	}

	public static void remove(String question, String ans, int count) {
		if (question.length() == 0) {
			if (count == 0) {
				System.out.println(ans);

			}
			return;
		}
		char ch = question.charAt(0);
		String ros = question.substring(1);
		if (count >= 0) {
			if (ch == '(') {
				remove(ros, ans + ch, count + 1);
				remove(ros, ans, count);
			} else {
				remove(ros, ans + ch, count - 1);
				remove(ros, ans, count);

			}
		} else {
           return;
		}

	}
}

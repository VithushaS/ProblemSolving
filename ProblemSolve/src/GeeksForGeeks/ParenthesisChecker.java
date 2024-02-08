package GeeksForGeeks;

import java.util.Stack;

public class ParenthesisChecker {
    static boolean isValid(String x) {
        Stack<Character> stack = new Stack<>();

        for (char c : x.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if ((c == ')' && openBracket != '(') ||
                        (c == '}' && openBracket != '{') ||
                        (c == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String x = "({})";

        System.out.println(isValid(x));
    }

}

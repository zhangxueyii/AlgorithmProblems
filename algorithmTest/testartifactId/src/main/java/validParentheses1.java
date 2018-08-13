import java.util.Stack;

public class validParentheses1 {
    public static boolean func(String s) {

        if ( s == null || s.length() == 0)
        {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')' && (stack.isEmpty() || stack.pop() != '(') ||
                        c == '}' && (stack.isEmpty() || stack.pop() != '{') ||
                        c == ']' && (stack.isEmpty() || stack.pop() != '[')
                        ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
import java.util.Stack;

public class leet6 {
public static int prackets(String str) {
    Stack<Integer> stack = new Stack<>();
    int limit = 0;
    stack.push(-1);

    for (int i = 0; i < str.length(); i++) {

        if (str.charAt(i) == '(') {

            stack.push(i);
        } else {
            stack.pop();

            if (stack.isEmpty()) {
                stack.push(i);

            } else {
                limit = Math.max(0, i - stack.peek());

            }
        }
    }
    return limit;
}}



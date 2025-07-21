import java.util.Stack;

public class leet5 {

    public static int longestP(String str) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  

        int limit = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    limit = Math.max(limit, i - stack.peek());
                }
            }
        }
        return limit;
    }

    public static void main(String[] args) {
        System.out.println(longestP("(()()((("));
        System.out.println(longestP("())"));
        System.out.println(longestP("((("));
    }
}
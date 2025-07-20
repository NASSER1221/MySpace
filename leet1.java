import java.util.Stack;

public class leet1 {

    public static boolean isValid(String s){
        Stack<Character> stack1=new Stack<>();

            for( char a:s.toCharArray()){

                switch (a){

                    case'(': stack1.push(')')  ; break;
                    case'{': stack1.push('}')  ; break;
                    case'[': stack1.push(']')  ; break;

                    default: if (stack1.isEmpty()|| stack1.pop()!=a) {
                        return false;
                    }
                }
            }
     return stack1.isEmpty();
    }

    public static void main(String[] args){

        System.out.println(isValid("[]"));
        System.out.println(isValid("{)"));
        System.out.println(isValid("(}"));
    }
}

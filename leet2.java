import java.util.Stack;

public class leet2 {

    public static boolean isValid(String s){
        Stack<Character> stack1=new Stack<>();

        for( char a:s.toCharArray()){

            switch (a){

                case '[': case'(': case'{': stack1.push(a); break;

                case')' :if( stack1.pop()!='(') return false;break;
                case']': if(stack1.pop()!='[') return false; break;
                case'}': if(stack1.pop()!='{') return false;break;
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



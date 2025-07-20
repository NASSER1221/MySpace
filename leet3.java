import java.util.Stack;

public class leet3 {

    public static String simplifyPath(String path) {

        Stack<String> stack1=new Stack<>();
        String [] location= path.split("/");


        for (String str: location){

            if(str.contains(".")){
                continue;
            } else if (str.contains("..")) {
                stack1.pop();
                
            } else {
                stack1.push(str);
                
            }
        } return "/" +String.join("/" ,stack1);

    }

    public static void main(String[] args){


        System.out.println(simplifyPath("desktop photos image"));
        System.out.println(simplifyPath("desktop /photos/..../ image"));
        System.out.println(simplifyPath("desktop// photos image"));
    }
}

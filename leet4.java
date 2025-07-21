import java.util.Arrays;

public class leet4 {

    public String longPrefix(String[] str){

        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        int index=0;

        while (index<first.length() && index<last.length() ){

            if (first.charAt(index)==last.charAt(index)){
                index++;

            }
            else break;
        }return first.substring(0,index);
    }
}

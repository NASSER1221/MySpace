import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeManager {

    public static String[] reverseStudentNames(String[] names) {

        String[] string1 = new String[names.length];

        for( int i=0;i< names.length;i++){
            StringBuilder string2=new StringBuilder();

            char[] er=names[i].toCharArray();

            for ( int j= er.length-1;j>=0;j--){

                    string2.append(er[j]);

            }
            string1[i]=string2.toString();
        }




         return string1;
    }

    public static char getLetterGrade(int score){

        if ((score <= 100) && (score >= 90)) {
            return 'A';

        } else if ((score < 90) && (score >= 80)) {
            return 'B';
            
        } else if ((score < 80) && (score >= 70)) {
            return 'C';
            
        } else if ((score < 70) && (score >= 60)) {
            return 'D';
            
        } else {
            return 'F';
            
      }

    }

    public static String[] findFailingStudents(String[] names, int[] scores){
        List<String> Students=new ArrayList<>();

        for(int i=0;i<names.length;i++){

            System.out.println("the student name is  "+ names[i] +"   the grade is" + scores[i]);
            if(scores[i]<60){
                Students.add(names[i]);
            }

        }
return Students.toArray(new String[0]) ;
    }

    public static void main(String[] args) {
        String[] Students={"nasser", "abdullah"};

        System.out.println(Arrays.asList(reverseStudentNames(Students)));

    }
}

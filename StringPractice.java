public class StringPractice {


    public static void main(String[] args) {


        String[] st = {"nasser", "abdullah"};
        StringBuilder string1 = new StringBuilder();

        for (int i = 0; i < st.length; i++) {
            char[] reverse = st[i].toCharArray();
            string1.append(" ");

            for (int j = reverse.length - 1; j >= 0; j--) {
                string1.append(reverse[j]);


            }


        }
        System.out.println(string1.toString());

    }


}
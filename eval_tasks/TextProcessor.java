public class TextProcessor {

    public static int countWords(String sentence){
        int words=0;
        char[] chara=sentence.toCharArray();
        for (int i=0;i< chara.length-1;i++) {

            if (chara[i]==' ') {
                words++;
            }
        }
        return words+1;
    }

    public static String replaceWord(String text, String oldWord, String newWord){

        return text.replace(oldWord,newWord);
    }



    public static void main(String[] args) {
        System.out.println(countWords("nasser abdullah"));
        String sentence = "Coding in Java is awesome";
        String replacedWord = TextProcessor.replaceWord(sentence, "Java", "Python");
        System.out.println(replacedWord);
    }
}

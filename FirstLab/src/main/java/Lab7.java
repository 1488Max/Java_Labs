
import java.util.stream.Stream;

public class Lab7 {

    public static void main(String[] args) {
        String text = "sasasasasa sasas ssas saas";
        String[] result = getStringsByTask(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

    }
    public static String[] getStringsByTask (String str){

        return Stream.of(str.split("\\s+"))
                .map(String::new)
                .map(Lab7::checkVowelAndConsonantEquality).toList().toArray(new String[0]);
    }
    public static String checkVowelAndConsonantEquality(String word) {

        word = word.toLowerCase();

            //Checks whether a character is a vowel
            long  vowels = word.chars().filter(ch -> (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' || ch == 'u')).count();
             long consonants = word.chars().filter(ch -> (ch != 'a' && ch != 'e' &&
                            ch != 'i' && ch != 'o' && ch != 'u'))
                    .filter(ch -> (ch >= 'a' && ch <= 'z')).count();


        if (vowels == consonants) {
            return word;
        } else return "";

    }
}
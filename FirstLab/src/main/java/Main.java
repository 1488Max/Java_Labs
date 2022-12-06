import java.util.ArrayList;

public class Main {
    //Lab 1 variant 3

    public static void main(String[] args) {

        String text = "sasasasasa івфаіфва asdaasssssss івівів";
        String[] result = getStringsByTask(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }

    public static String[] splitString(String string) {
        return string.split(" ");
    }

    public static boolean checkCharacters(String word) {
        return word.matches("^[a-zA-Z0-9.]+$");
    }

    public static boolean checkVowelAndConsonantEquality(String word) {
        int vCount = 0, cCount = 0;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            //Checks whether a character is a vowel
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            } else {
                cCount++;
            }
        }

        if (vCount == cCount) {
            return true;
        } else return false;

    }


    public static String[] getStringsByTask(String string) {
        String[] words = splitString(string);
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
           if(checkCharacters(words[i])){
               if (checkVowelAndConsonantEquality(words[i])){
                   resultList.add(words[i]);
               }
           }
        }
        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);
        return result;
    }

}

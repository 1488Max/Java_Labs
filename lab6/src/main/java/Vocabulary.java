import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Vocabulary {
    private HashMap<String,String> pairs = new HashMap<>();

    public void addPairs(String engWord, String ukrWord) {

        if (!isStringAWord(engWord)) {
            System.out.println("You can input only pair of words!!!");
            return;
        }

        if (!isStringAWord(ukrWord)) {
            System.out.println("You can input only pair of words!!!");
            return;
        }
        pairs.put(engWord,ukrWord);
    }

    public HashMap<String, String> getPairs() {
        return pairs;
    }

    public  String translate(String input){
        String[] words = input.split("\\W+");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(pairs.get(words[i])!=null){
            arrayList.add(i,pairs.get(words[i]));
            }
            else {
                arrayList.add(words[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            result.append(arrayList.get(i)).append(" ");
        }
        return result.toString();
    }

    public boolean isStringAWord(String string){
        String [] array = string.trim().split(" ");
        if(array.length==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Vocabulary vocabulary = new Vocabulary();
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Додати значення - натисніть один," +
                    "Перекласти речення - натисніть два");
            String check = in.nextLine();
            if (Objects.equals(check, "1")){
                System.out.println("Введіть пару слів, спочатку англійське значення");
                String engWord = in.nextLine();
                System.out.println("Тепер значення українською");
                String uaWord = in.nextLine();
                vocabulary.addPairs(engWord, uaWord);
                System.out.println("Пара добавлена");

            }
            if(Objects.equals(check, "2")){
                System.out.println("Введіть речення для перекладу");
                System.out.println("Переклад: " + vocabulary.translate(in.nextLine()));
            }

        }


    }

}



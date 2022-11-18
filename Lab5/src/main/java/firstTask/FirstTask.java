package firstTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstTask {

    public static ArrayList<String> getStrings(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();
        while(scanner.hasNext()){
            strings.add(scanner.nextLine());
        }
        return strings;
    }
    public static String findStringWithMostWords(ArrayList<String> strings){
        int most = 0;
        int indexOfBiggest = 0;
        for (int i = 0; i < strings.size(); i++) {
            String[] arr = strings.get(i).split(" ");
            int length = arr.length;
            if(length>most){
                most=length;
                indexOfBiggest = i;
            }
        }
        return strings.get(indexOfBiggest);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");
        System.out.println("findStringWithMostWords(getStrings(file)) = " + findStringWithMostWords(getStrings(file)));
    }
}

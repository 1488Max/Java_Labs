package thirdTask;

import java.io.*;

public  class   Cryptographer {

    public static String toEncryptString(String string, char c){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char stringChar = string.charAt(i);
            int newCharCode = (int) stringChar + (int) c;
            char newChar = (char) newCharCode;
            result.append(newChar);

        }

        return result.toString();
    }
    public static String decode(String string, char c){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char stringChar = string.charAt(i);
            int newCharCode = (int) stringChar - (int) c;
            char newChar = (char) newCharCode;

            result.append(newChar);

        }

        return result.toString();
    }

    public static void decodeFile(File file,char c) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        FilterInputStream fileInputStream = new BufferedInputStream(inputStream);
        StringBuilder inputString = new StringBuilder();
        int k= 0;
        while((k=fileInputStream.read())!=-1){
            inputString.append(k);
        }
        fileInputStream.close();
        inputStream.close();
        decode(inputString.toString(),c);

    }

}

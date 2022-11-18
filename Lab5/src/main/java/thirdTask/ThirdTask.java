package thirdTask;

import java.io.*;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        File input = new File("Input.txt");
        FileInputStream inputStream = new FileInputStream(input);
        FilterInputStream fileInputStream = new BufferedInputStream(inputStream);
        StringBuilder inputString = new StringBuilder();
        int k= 0;
        while((k=fileInputStream.read())!=-1){
            inputString.append(k);
        }
        fileInputStream.close();
        inputStream.close();

        File output = new File("Output.txt");
        FileOutputStream outputStream = new FileOutputStream(output);
        FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream);
        Cryptographer.toEncryptString(inputString.toString(),'A');
    }
}

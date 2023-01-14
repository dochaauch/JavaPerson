package profJava.cons230113;

import java.io.*;

public class ReadTextEx {
    public static void main(String[] args) {
        String pathInput = "british.txt";
        String pathOutput = "britishRev.txt";
        readAndRevertText(pathInput, pathOutput);
    }

    public static void readAndRevertText(String pathInput, String pathOutput){
        try(
                BufferedReader bufferedReader
                        = new BufferedReader(new FileReader(pathInput));
                BufferedWriter bufferedWriter
                        = new BufferedWriter(new FileWriter(pathOutput, true));
        ) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).reverse();
            }
            bufferedWriter.write(sb.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

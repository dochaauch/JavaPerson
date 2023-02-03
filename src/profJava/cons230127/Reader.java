package profJava.cons230127;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String > readFromFile(String path) {
        List<String> listOfStrings = new ArrayList<>();

        //return Files.readAllLines(); //организовать рефакторинг, вернет list
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                listOfStrings.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException("IO Exception");
        }
        return listOfStrings;
    }
}

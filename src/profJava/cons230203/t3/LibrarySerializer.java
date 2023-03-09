package profJava.cons230203.t3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LibrarySerializer implements Closeable {
    private File file = new File("./src/profJava/cons230203/t3/output.json");
    private File file1 = new File("./src/profJava/cons230203/t3/output_gson.json");
    private List<Library> libraries;

    public void writeToFile(List<Library> libraries){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(file, libraries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeWithGson(List<Library> libraries) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(libraries);

        try(FileWriter writer = new FileWriter(file1)){
            writer.write(str);
            System.out.println("DONE!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void close() throws IOException {
        //file.close();
    }
}

package profJava.cons230203.t3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class LibrarySerializer implements Closeable {
    private File file = new File("./src/profJava/cons230203/t3/output.json");
    private List<Library> libraries;

    public void writeToFile(List<Library> libraries){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(file, libraries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        //file.close();
    }
}

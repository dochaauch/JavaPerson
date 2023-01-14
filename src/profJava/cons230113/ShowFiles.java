package profJava.cons230113;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Objects;

public class ShowFiles {
    public static void main(String[] args) {
        String dir = "./";
        String ext = ".java";
        path(ext, dir);
    }

    public static void path(String ext, String path) {
        File file = new File(path);
        Arrays.stream(Objects.requireNonNull(file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file1) {
                if(file1.isDirectory()){
                    path(ext, file1.getPath());
                    return false;
                }
                return file1.getName().contains(ext);
            }
        }))).forEach(System.out::println);
    }

}

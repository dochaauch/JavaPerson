package profJava.lesson230116.file;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("british.txt");
        File folder = new File("./src/profJava/lesson230111");
        file.getName().toLowerCase().startsWith("english");

        System.out.println("File: " + file.getAbsolutePath());
        System.out.println("Folder: " + folder.getAbsolutePath());

        System.out.println("File: " + file.isAbsolute());
        System.out.println("Folder: " + folder.isAbsolute());

        System.out.println("File: " + file.isFile());
        System.out.println("Folder: " + folder.isDirectory());

        System.out.println("File: " + file.exists());
        System.out.println("Folder: " + folder.exists());

        System.out.println("File: " + file.length());
        System.out.println("Folder: " + folder.length());
    }
}

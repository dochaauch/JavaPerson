package profJava.lesson230116;
/*Создать метод который ищет файлы с  расширением*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {
    private static void getFiles(File root, List<File> fileList, String ext) {
        //System.out.println(Arrays.toString(root.listFiles()));
        for (File file1 : root.listFiles()) {
            if(file1.isDirectory()) {
                getFiles(file1, fileList, ext);
            } else {
                if(file1.getName().endsWith(ext)){
                    fileList.add(file1);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<File> list = new ArrayList<File>();
        getFiles(new File("./"), list, ".txt");

        for (File file : list) {
            System.out.println(file.getAbsolutePath());
        }
    }


}

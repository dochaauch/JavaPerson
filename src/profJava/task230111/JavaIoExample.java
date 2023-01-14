package profJava.task230111;

import java.io.*;

public class JavaIoExample {
    public static void main(String[] args) throws IOException {
        //simpleFileExample();
        //fileTreeWalk(new File("./"));
        //directoriesEx();

        //simpleRead();

        //readingMethodComparrison();

        try(BufferedReader br = new BufferedReader(new FileReader("example/2.txt"))) {
            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private static void readingMethodComparrison() throws IOException {
        try (FileInputStream fis = new FileInputStream("example/2.txt")) {
            long start = System.currentTimeMillis();
            int b;
            //ArrayList<Byte> list = new ArrayList();
            while ((b = fis.read()) > -1) {
                //System.out.print((char)b);
                // list.add((byte) b);
            }
            System.out.println("Simple read");
            System.out.println(System.currentTimeMillis() - start);
            //System.out.println(new String(list.toArray()));
        }


        try (FileInputStream fis = new FileInputStream("example/2.txt")) {
            byte[] buf = new byte[16];
            long start = System.currentTimeMillis();
            int b;
            //ArrayList<Byte> list = new ArrayList();
            while ((b = fis.read(buf)) > -1) {
                //System.out.print((char)b);
                // list.add((byte) b);
            }
            System.out.println("Buffered read");
            System.out.println(System.currentTimeMillis() - start);
            //System.out.println(new String(list.toArray()));
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example/2.txt"))) {
            long start = System.currentTimeMillis();
            int b;
            //ArrayList<Byte> list = new ArrayList();
            while ((b = bis.read()) > -1) {
                //System.out.print((char)b);
                // list.add((byte) b);
            }
            System.out.println("BufferedStream read");
            System.out.println(System.currentTimeMillis() - start);
            //System.out.println(new String(list.toArray()));
        }
    }

    private static void simpleRead() throws IOException{
        try (FileInputStream fis = new FileInputStream("example/1.txt")) {

            int b;
            //ArrayList<Byte> list = new ArrayList();
            while((b = fis.read()) > -1) {
                System.out.print((char)b);
               // list.add((byte) b);
            }

            //System.out.println(new String(list.toArray()));
        }
    }

    private static void directoriesEx() {
        File file = new File("example/1");
        if(!file.exists()) {
            System.out.println(file.mkdir());
        }
        File file1 = new File("example/1/2/3/4/");
        if(!file1.exists()) {
            System.out.println(file1.mkdirs());
        }

        //file.createNewFile();
    }

    private static void fileTreeWalk(File root) {
        if (root.isFile()) {
            System.out.println("File --> " + root.getPath());
        } else {
            System.out.println("Directory --> " + root.getPath());
//            File[] files = root.listFiles(new FileFilter() {
//                @Override
//                public boolean accept(File pathname) {
//                    return !pathname.isHidden();
//                }
//            });

            File[] files = root.listFiles(f -> !f.isHidden() && !f.getName().contains(".idea"));


            for (File file : files) {
                fileTreeWalk(file);
            }
        }
    }

    private static void simpleFileExample() throws IOException {
        File file = new File("example/1.txt");
        //System.out.println(file.canRead());
        if(!file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        String s = "Hello world";
        String a = "Another string";

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write(a.getBytes());
        }
    }
}

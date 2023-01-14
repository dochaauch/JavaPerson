package profJava.cons230113;

import java.io.*;

public class CopyFileEx {
    public static void main(String[] args) {
        String pathInput = "img.png";
        String pathOutput = "img_copy.png";
        String pathOutputBuf = "img_copyBuf.png";
        String pathOutputBufAll = "imp_copyBufAll.png";

        long start = System.currentTimeMillis();
        readWriteFile(pathInput, pathOutput);
        System.out.println("time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        readWriteFileBuf(pathInput, pathOutputBuf);
        System.out.println("time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        readWriteFileBufAll(pathInput, pathOutputBufAll);
        System.out.println("time: " + (System.currentTimeMillis() - start));
    }

    public static void readWriteFile(String pathInput, String  pathOutput) {
        try (FileInputStream inputStream = new FileInputStream(pathInput);
             FileOutputStream outputStream = new FileOutputStream(pathOutput)) {
            int ch;
            while((ch = inputStream.read()) != -1) {
                outputStream.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readWriteFileBuf(String pathInput, String pathOutput) {
        try (BufferedInputStream bufferedInputStream
                     = new BufferedInputStream(new FileInputStream(pathInput));
             BufferedOutputStream bufferedOutputStream
                     = new BufferedOutputStream(new FileOutputStream(pathOutput))) {
            int ch;
            while((ch = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readWriteFileBufAll(String pathInput, String pathOutput) {
        try (BufferedInputStream bufferedInputStream
                     = new BufferedInputStream(new FileInputStream(pathInput));
             BufferedOutputStream bufferedOutputStream
                     = new BufferedOutputStream(new FileOutputStream(pathOutput))) {
            bufferedOutputStream.write(bufferedInputStream.readAllBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

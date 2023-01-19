package profJava.task230116;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class JavaIOSecond {
    public static void main(String[] args) {
        //countLettersLoop();
        //countLettersStream();

        Cat barsik = new Cat();
        barsik.setName("Barsik");
        barsik.setColor("White");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cats/barsik.ser"))){
            oos.writeObject(barsik);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cats/barsik.ser"))){
            Cat resurrected = (Cat) ois.readObject();
            System.out.println(barsik == resurrected);
            System.out.println(barsik.equals(resurrected));
            System.out.println(barsik);
            System.out.println(resurrected);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    private static void countLettersStream() {
        try(BufferedReader br = new BufferedReader(new FileReader("example/3.txt"))) {
            long result = br.lines()
                    .map(String::toCharArray)
                    .map(arr -> {
                        var list =  new ArrayList<Character>();
                        for(char c:arr) {
                            list.add(c);
                        }
                        return list;
                    })
                    .flatMap(Collection::stream)
                    .filter(Character::isUpperCase)
                    .count();
            System.out.println("Uppers: " + result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void countLettersLoop() {
        try(BufferedReader br = new BufferedReader(new FileReader("example/3.txt"))) {
            long upperCount = 0;
            long lowerCount = 0;

            String line;
            while ((line = br.readLine())!=  null) {
                for (Character c : line.toCharArray()) {
                    if (Character.isLetter(c) && Character.isUpperCase(c)) {
                        upperCount++;
                    } else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                        lowerCount++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

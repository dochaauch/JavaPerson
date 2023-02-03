package profJava.cons230203.t3;
/*Напишите программу, которая содержит класс Библиотека, Подписчики, Книги.
Создайте несколько обьектов класса Библиотека, заполните его Подписчиками и Книгами.
Создайте класс LibrarySerializer который сохраняет состояние списка обьектов Библиотека в json file.
Используйте интерфейс Closeable

import com.fasterxml.jackson.databind.ObjectMapper;
ObjectMapper mapper = new ObjectMapper();
objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
*/
public class Main {
    public static void main(String[] args) {
        //System.out.println(Generator.createLibrary());
        LibrarySerializer ls = new LibrarySerializer();
        ls.writeToFile(Generator.createLibrary());
    }
}

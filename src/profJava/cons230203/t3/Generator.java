package profJava.cons230203.t3;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static List<Library>  createLibrary(){
        List<Subscriber> subscribers = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        books.add(new Book("Title1", "Author1"));
        books.add(new Book("Title2", "Author2"));
        books.add(new Book("Title3", "Author3"));
        books.add(new Book("Title4", "Author4"));
        Subscriber s1 = new Subscriber("Ivanov Ivan", books);
        Subscriber s2 = new Subscriber("Sergeev Sergei", books);
        Subscriber s3 = new Subscriber("Petrov Petr", books);
        Subscriber s4 = new Subscriber("Ivanova Inga", books);
        subscribers.add(s1);
        subscribers.add(s2);
        subscribers.add(s3);
        subscribers.add(s4);
        Library library1 = new Library("Library1", subscribers);
        Library library2 = new Library("Library2", subscribers);
        Library library3 = new Library("Library3", subscribers);
        Library library4 = new Library("Library4", subscribers);
        List<Library> libraries = new ArrayList<>();
        libraries.add(library1);
        libraries.add(library2);
        libraries.add(library3);
        libraries.add(library4);
        return libraries;
    }
}

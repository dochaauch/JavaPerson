package profJava.cons230203.t3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Library {
    String name;
    List<Subscriber> subscribers;
}

@Setter
@Getter
@AllArgsConstructor
@ToString
class Subscriber{
    String fullName;
    List<Book> books;
}

@Setter
@Getter
@AllArgsConstructor
@ToString
class Book {
    private String title;
    private String author;
}
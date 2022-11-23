package basicJava.lesson221010;

public class Ex1 {
    int q = 10; // создание переменной примитивного типа, меньше памяти,  в stack
    Integer r = 10; //переменная ссылочного типа, больше памяти, в heap ссылка на stack
    Ex1 ex1 = new Ex1(); //объект типа Ex1 ссылочный тип данных
    String s = new String("ff");

    public static void main(String[] args) {

    }
}

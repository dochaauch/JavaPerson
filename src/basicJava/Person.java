package basicJava;

public class Person {
    //цифры
    short s;
    byte b1 = 126;
    long l;
    int i;

    double d = 2.5;
    float f1 = 11.6f;

    String s1 = "text";
    char c = '5';
    boolean b = false;

    void getSum(double alina, double oleg) {
        System.out.println(alina + oleg);
    }

    private static double getSumD(double alina, double oleg) {
        return alina + oleg;
    }

    double getMinusResult(double vera){
        return getSumD(10.0, 10.0) - vera;
    }

    public void main(String[] args) {
        /*
        * +
        * -
        * *
        * /
        *
        * ^
        * %  9%2=1  8%2=0
        *
         */



        System.out.println(getSumD(5.5, 12.5)); //double "18.0"
        getSum(5.5, 12.5); //void "18.0"
        //getSum(getMinusResult(20.0, 10.0), getSumD(2.5, 1.2));

        int a =4;
        int b = 3;
        int result = a / b;
        System.out.println(result);
        System.out.println(4923 % 10);
    }

}


class Test {
    public static void main(String[] args) {
        Person person = new Person();
        String b = person.s1;
        person.getMinusResult(5);

    }
}
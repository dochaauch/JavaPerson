package profJava.lesson230123.excep;

public class ExcEx {
    private static void get(int a){
        if(a % 2 == 0) {
            throw new NotEvenDigitException("This number cannot be even");
        } else System.out.println(a);
    }

    public static void main(String[] args) {
        
    }

}

package profJava.cons230203.t1;

public class NegativeIntegerFoundException extends Exception {
//    public NegativeIntegerFoundException(String message) {
//        super(message);
//    }
    public NegativeIntegerFoundException(int negative){
        super(String.format("Found negative number: %d", negative));
    }
}

package profJava.cons230203.t2;

public class WrongTransactionArgument extends Exception{
    public  WrongTransactionArgument(int amount){
        super(String.format("Negative sum is found: %d", amount));
    }
}

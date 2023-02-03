package profJava.cons230203.t2;

public class NotEnoughMoney extends Exception{
    public NotEnoughMoney(int amount){
        super(String.format("there are insufficient sums of money available for cash withdrawal. " +
                "Sum %d is too large.", amount));
    }
}

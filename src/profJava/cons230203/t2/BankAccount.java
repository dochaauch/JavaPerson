package profJava.cons230203.t2;

import lombok.Getter;
import lombok.Setter;

/*Создайте класс BankAccount. В классе должны присутвовать функции для депозита и снятия денег.
Класс должен выбрасывать 2 исключения - если аргумент для снятия или депозита -
отрицательное значение - WrongTransactionArgument.
И NotEnoughMoney если при снятии наличных не хватает средств.*/
@Getter
@Setter
public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(int amount) throws WrongTransactionArgument {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            throw new WrongTransactionArgument(amount);
        }
    }

    public void cashOut(int amount) throws NotEnoughMoney, WrongTransactionArgument {
        if(amount < 0) {
            throw new WrongTransactionArgument(amount);
        }
        balance = getBalance() - amount;
        if (balance >= 0 )  {
            setBalance(balance);
        } else {
            throw new NotEnoughMoney(amount);
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("1234", 50);
        try {
            ba.depositMoney(100);
        } catch (WrongTransactionArgument e) {
            System.err.println(e);
        }
        try {
            ba.cashOut(151);
        } catch (NotEnoughMoney e) {
            System.err.println(e);
        } catch (WrongTransactionArgument e) {
            System.err.println(e);
        }


    }

}

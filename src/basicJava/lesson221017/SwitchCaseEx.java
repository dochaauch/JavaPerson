package basicJava.lesson221017;

import java.util.Scanner;

public class SwitchCaseEx {
    int result;
    int num1;
    int num2;
    String operation;
    Scanner scanner =  new Scanner(System.in);

    private void getResult() {
        operation  = scanner.next();
        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            default -> {
                System.out.println();
                result = 0;
            }
        }
    }
}

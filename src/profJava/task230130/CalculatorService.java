package profJava.task230130;

import profJava.task230125.Calculator;

public class CalculatorService {
    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b){
        return calculator.add(a, b);
    }

    public int sub(int a, int b){
        return calculator.sub(a, b);
    }

    public int mul(int a, int b){
        return calculator.mul(a, b);
    }

    public int div(int a, int b){
        return calculator.div(a, b);
    }
}

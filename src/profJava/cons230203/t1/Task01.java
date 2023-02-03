package profJava.cons230203.t1;
/*Напишите функцию, которая принимает в качестве аргументов массив целых чисел и
если в массиве присутствует отрицательные числа - генерирует custom exception IntegerFoundException*/

public class Task01 {
    public void processingArray(int[] arr) throws NegativeIntegerFoundException {
        for (int el : arr) {
            if (el < 0) {
                throw new NegativeIntegerFoundException(el);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,4};
        Task01 t1 = new Task01();
        try {
            t1.processingArray(arr);
        } catch (NegativeIntegerFoundException e) {
            System.err.println("Negative digit due to: " + e.getMessage());
        }
    }
}

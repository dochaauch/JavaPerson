package basicJava.lesson221109;

public class Test{
    public static void main(String[] args) {
        int[] arr = {-3, 2, 85, 4, 3, 6, 25, 0, 22, 10};
        int min_val = Integer.MAX_VALUE;
        int min_next = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min_val > arr[i] || min_next > arr[i]){
                min_next = min_val;
                min_val = arr[i];
            }
        }
        System.out.println(min_val + " " + min_next);
    }
}

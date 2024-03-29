package profJava.task221214;

//public class MyStackImpl<T> implements MyStack<T> {
//    private static int DEFAULT_SIZE = 10;
//    private static float DEFAULT_GROWTH_RATE = 2;
//    private Object[] vector;
//    private int pointer;
//    private float growthRate;
//
//    public MyStackImpl() {
//        vector = new Object[DEFAULT_SIZE];
//        pointer =-1;
//        this.growthRate = DEFAULT_GROWTH_RATE;
//    }
//
//    public MyStackImpl(float growthRate) {
//        vector = new Object[DEFAULT_SIZE];
//        pointer =-1;
//        this.growthRate = growthRate; // check growth rate min and max value(1<->2)
//    }
//
//    @Override
//    public T push(T el) {
//        vector[++pointer] = el;
//        return el;
//    }
//
//    @Override
//    public T pop() {
//        if(isEmpty()) {
//            throw new EmptyStackException();
//        }
//        T el = (T) vector[pointer];
//        vector[pointer--] = null;
//        return el;
//    }
//
//
//    private void grow() {
//        int newLength = (int) (vector.length * growthRate);
//        Object[] newVector = Arrays.copyOf(vector, newLength);
//        vector = newVector;
//    }
//
//    private boolean needToGrow()  {
//        return pointer == vector.length - 1;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return pointer < 0;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("[");
//        for (int i = 0; i <= pointer; i++) {
//            if(i != pointer){
//                sb.append(vector[i]).append(", ");}
//            else{
//                sb.append(vector[i]);
//            }
//        }
//        sb.append("]");
//        return sb.toString();
//    }
//}
package task221214;

//public class MyPriorityQueueImpl<T> implements MyPriorityQueue<T> {
//    List<T> list = new LinkedList<>();
//
//    @Override
//    public boolean add(T el) {
//        if (el == null)
//            throw new NullPointerException();
//        list.add(el);
//        return list.contains(el);
//    }
//
//    @Override
//    public boolean remove(T el) {
//        boolean isRemove = false;
//        if(list.contains(el)){
//            list.remove(el);
//            isRemove = true;
//        }
//        return isRemove;
//    }
//
//    @Override
//    public T peek() {
//        if(!list.isEmpty()) {
//            T el = null;
//            List listPoll = list;
//            Collections.sort(listPoll);
//            el = (T) listPoll.get(0);
//            return el;
//        }
//        else return null;
//    }
//
//    @Override
//    public T poll() {
//        if(!list.isEmpty()) {
//            T el = null;
//            List listPoll = list;
//            Collections.sort(listPoll);
//            el = (T) listPoll.get(0);
//            list.remove(el);
//            return el;
//        }
//        else return null;
//    }
//
//    @Override
//    public String toString() {
//        return list.toString();
//    }
//}
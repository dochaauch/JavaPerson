package profJava.cons221118;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TimeList {
    public static void main(String[] args) {
        int iterationCount = 1_000_000;
        List<Double> lList = new LinkedList<Double>();
        List<Double> aList = new ArrayList<Double>();

        long tl1 = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            lList.add(Math.random());
        }
        long tl2 = System.currentTimeMillis();

        long ta1 = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            aList.add(Math.random());
        }
        long ta2 = System.currentTimeMillis();

        System.out.println("Time spent insertion to LinkedList: " + (tl2-tl1));
        System.out.println("Time spent insertion to ArrayList: " + (ta2-ta1));

        int ind = 0;
        for (Double element: lList) {
            if (ind == 10) {
                lList.remove(element);
                ind = 0;
            }
            ind++;
        }

//        Iterator lL = lList.iterator();
//        Iterator aL = aList.iterator();
//
//        long lt1 = System.currentTimeMillis();
//        int idx = 0;
//        while (lL.hasNext()) {
//            idx++;
//            lL.next();
//            if (idx == 10) {
//                idx = 0;
//                lL.remove();
//            }
//        }
//        long lt2 = System.currentTimeMillis();
//
//        long at1 = System.currentTimeMillis();
//        int idx1 = 0;
//        while (aL.hasNext()) {
//            idx1++;
//            aL.next();
//            if (idx1 == 10) {
//                idx1 = 0;
//                aL.remove();
//            }
//        }
//        long at2 = System.currentTimeMillis();
//
//        System.out.println(
//                "Time spent to remove elements in Linked list: " + (tl2 - tl1)
//        );
//        System.out.println("Time spent to remove elements in Array list: " + (at2 - at1));


    }
}

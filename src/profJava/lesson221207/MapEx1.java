package profJava.lesson221207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(89654, "Natalja");
        map.put(12365, "Natalja");
        map.put(645, "Aleksander");
        map.put(9874, "Sergey");
        map.put(8123, "User");
        map.put(23658, "Uliana");
        map.put(null, "Ivan");
        map.put(9996, null);
        map.putIfAbsent(6456, "********");
        map.putIfAbsent(64511, ".....");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        //System.out.println(map.values().getClass().getSimpleName());

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(51);
        list.add(52);
        list.add(53);
        list.add(54);
        list.add(55);
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}

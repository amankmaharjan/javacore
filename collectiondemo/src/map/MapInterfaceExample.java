package map;

import java.util.*;

class MapInterfaceExample {
    public static void main(String args[]) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(null, "Rahul");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}  
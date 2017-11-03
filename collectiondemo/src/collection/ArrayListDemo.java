package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        System.out.println("using iterator");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //using for loop
        System.out.println("using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("using for each");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("using lambda");
        list.forEach((l) -> System.out.println(l.toString()));
        System.out.println("using method refercne");
        list.forEach(System.out::println);
    }
}

package collection;


import java.util.*;

import collection.entity.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<Book>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for (Book b : set
                ) {
            System.out.println(b.toString());
        }
    }
}  
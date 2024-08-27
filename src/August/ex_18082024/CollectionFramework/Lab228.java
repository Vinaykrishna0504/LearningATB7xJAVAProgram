package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab228 {
    public static void main(String[] args) {
        // Collections Framework
        // Collection - Interface
        // Collection - List(I)
        // List(I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection od items, Todo List, Student List.
       // Collection mylist3 = new ArrayList();// Dynamic dispatch
       //  List mylist = new ArrayList(); // Dynamic dispatch
        ArrayList mylist2 = new ArrayList();
        mylist2.add("Vinay");
        mylist2.add("Krishna");
        mylist2.add("Krish");
        mylist2.add(123);
        mylist2.add(true);

        System.out.println(mylist2); // [Vinay, Krishna, Krish]
        System.out.println(mylist2.size()); // 4
        System.out.println(mylist2.contains("Krish")); // True
        System.out.println(mylist2.contains("Krishn")); // False
        String s1 = (String) mylist2.get(1);
        System.out.println(s1);

    }
}

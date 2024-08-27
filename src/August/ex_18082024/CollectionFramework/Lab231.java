package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        List mylist = new ArrayList(); // Most of the times, it will be used
        //ArrayList mylist2 = new ArrayList(); // Most of the times, it will be used
        mylist.add("Vinay");
        mylist.add("Krishna");
        mylist.add("Krish");
        mylist.add("Vinay");
        mylist.add("Vinay");
        // Add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, clearAll, containsAll, retainAll
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Vinay");
        System.out.println(mylist);
        mylist.clear();
        mylist.add("Vinay");
        mylist.add("Krishna");
        mylist.add("Krish");
        mylist.add("Vinay");
        mylist.add("Vinay");
        System.out.println(mylist);
        mylist.add("Ganiga");
        System.out.println(mylist);
        mylist.set(1, "KrishnaGaniga");
        System.out.println(mylist);

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        System.out.println(" ----- ");

        // How to print?
        for (int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        System.out.println(" ----- ");

        // Enhanced for loop
        for (Object o:mylist){
            System.out.println(o);
        }
    }
}

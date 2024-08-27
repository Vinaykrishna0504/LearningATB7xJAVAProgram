package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Vinay");
        mylist.add("Krishna");
        mylist.add("Ganiga");

        System.out.println(" - To Print Arraylist - 1 ");

        for (String str : mylist){
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i< mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        System.out.println(" - To Print Arraylist - 3 ");

        // Iterator
        Iterator<String> its = mylist.iterator();
        while(its.hasNext()) {
            System.out.println(its.next());
        }


    }
}

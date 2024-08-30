package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab235 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(); // FR - CO
        mylist1.add("Vinay");
        mylist1.add("Krishna");
        mylist1.add("Ganiga");

        Vector v = new Vector();
        v.add("Vinay");
        v.add("Krishna");
        v.add("Ganiga");
        System.out.println(v);
        // Only Problem with the vector
        // - It is thread safe, Synchronised.
        // It will be time consuming
        // One by One - usage
        // Slower


    }


}

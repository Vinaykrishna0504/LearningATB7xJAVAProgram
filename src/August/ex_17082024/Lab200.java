package August.ex_17082024;

public class Lab200 {
     public static void main(String[] args) {
        APIAutomation a = new APIAutomation();
        APIAutomation a2 = new APIAutomation();
        // SIB - Call 1 time
         // IIB will call when object is created
    }
}

class APIAutomation{
    static {
        System.out.println("Loaded data from MySQL");
    }

    {
        System.out.println("Loaded data from CSV file");
    }



}

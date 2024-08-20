package August.ex_17082024;

public class Lab211 {
    public static void main(String[] args) {
        int c = 2;
        try {
             c = 10/2;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("/ by Zero, won't work");
        }
        System.out.println(c);
        System.out.println("End");
    }
}

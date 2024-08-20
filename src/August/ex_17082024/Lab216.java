package August.ex_17082024;

public class Lab216 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Error e) {
            System.out.println("div by zero");
        } finally {
            System.out.println("I will be always executed");
        }
    }
}

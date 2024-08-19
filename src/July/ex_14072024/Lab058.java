package July.ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total_price = course + GST; // Invalid Implicit narrowing
        int total_price = course +(int)GST;// Explicit Narrowing - Money Loss
        System.out.println(total_price);
    }
}

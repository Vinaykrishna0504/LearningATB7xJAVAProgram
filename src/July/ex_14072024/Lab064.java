package July.ex_14072024;

public class Lab064 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A -> ++a, exp = 11, a =11
        // +
        // B -> ++a, exp = 12, a =12
        //exp = A + B = 23, a = 12
    }
}

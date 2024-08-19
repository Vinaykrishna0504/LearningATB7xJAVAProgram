package August.ex_17082024;

public class Lab197 {
    public static void main(String[] args) {
        String num = "10";
        // int a = (int) num; Type casting not possible
        Integer a = Integer.valueOf(num);
        System.out.println(a);

        // String to primitive?
        int a2 = Integer.parseInt(num);
        System.out.println(a2);

        // This will be used whenever we want convert string into int, Integer
        // Primitive to wrapper or vice versa
    }
}

package August.ex_17082024;

public class Lab196 {
    public static void main(String[] args) {
        // Primitive to wrapper class
        int a = 10;
        Integer b = a;
        //Integer.MAX_VALUE
        System.out.println(a);// No extra utilites after typing . after a
        System.out.println(b);// Have extra utilities

        // Wrapper class to primitive
        Integer a1 = 10;// Auto Boxing means int is always converted Integer automatically
        int b1 = a1; // Unboxing -> Integer to int
        System.out.println(a1);
        System.out.println(b1);
    }
}

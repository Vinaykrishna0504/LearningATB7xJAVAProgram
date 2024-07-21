package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("Vinay"); // New operator always create a new memory
        String s2 = new String("Vinay");
        String s3 = new String("Vinay");

        System.out.println(s1 == s2);// check for reference
        // is the string is stored in heap, the same string also considered as different and counted
        System.out.println(s1.equals(s3)); // check for content
        // The answer will be true, as the content is same
    }
}

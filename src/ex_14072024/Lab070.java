package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String S1 = new String("Vinay");
        String S2 = new String("Vinay");
        // 2 strings are created in Heap area
        String S3 = S1;
        // 2, still 2 strings only, because s3 points to s1, both of them points to Vinay


    }
}

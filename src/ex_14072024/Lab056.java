package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        // Type casting - Source and Destination conversion
        // Widening - Implicit and Explicit - Loss less
        // Narrowing - Implicit and Explicit(with data type) - Loss

        // Widening
        byte b=10;
        int a=b;
        int a1=(int)b;
        System.out.println(a1);

        //Narrowing
        int val = 300; // The answer is will be 44 based on Binary conversions
        //byte b1 = val; // Invalid implicit casting, because int is bigger than byte, and int can not be put into it.
        byte b1 = (byte)val; // Valid- Explicit casting - Loss of data
        System.out.println(b1);
    }
}

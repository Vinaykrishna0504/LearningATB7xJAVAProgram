package August.ex_17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210 {
    public static void main(String[] args) {
        // Exception
        // Checked- JVM knows
       // try {
         //   FileInputStream file = new FileInputStream("C://log.txt")
        //} catch (FileNotFoundException e){
          //  throw new RuntimeException(e);
       // }

        // Unchecked
        try {
            int a = 10;
            int c = a/0; // java.lang.ArithmeticException
            System.out.println("c");
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("Error div by Zero");
        }
    }
}

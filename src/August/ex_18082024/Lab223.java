package August.ex_18082024;

import java.util.Scanner;

public class Lab223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if (name.equalsIgnoreCase("Vinay")){
            try {
                throw new Exception("Not Allowed!!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Allowed");
        }
    }
}

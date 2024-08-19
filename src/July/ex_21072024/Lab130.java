package July.ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        // Coding Program
        // Factorial program
        // n = 5 -> fact = 5*4*3*2*1 -> 120
        // n = 3 -> fact = 3*2*1 -> 6
        // n = 1 -> fact = 1 -> 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, will print factorial");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}

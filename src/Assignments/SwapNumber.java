package Assignments;

import java.util.Scanner;


public class SwapNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A");
        int A = sc.nextInt();

        System.out.println("Enter the number B");
        int B = sc.nextInt();

        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println("The value of A: " +A);
        System.out.println("The value of B: " +B);
    }
}

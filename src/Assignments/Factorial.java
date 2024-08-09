package Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();

        for (int i = 1; i <=number; i++) {
            n = n * i;
        }
        System.out.println("Factorial is : " + n);
    }
}

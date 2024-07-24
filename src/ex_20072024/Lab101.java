package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        // Write a program for Name, Age, Salary and Print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);

        sc.close();
    }
}

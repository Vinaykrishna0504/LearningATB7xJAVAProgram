package Assignments;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = sc.nextInt();

        if (Year % 4 == 0){
            System.out.println("This is a leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}

package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // If - condition (If, else if , else) - Multiple condition

        // Switch - Better way to 2+ condition
        // which day it is - day from 1 to 7
        // -> Wednesday
        //MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell what it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, What day it is");
        }
    }
}

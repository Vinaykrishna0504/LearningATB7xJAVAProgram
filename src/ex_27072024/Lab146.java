package ex_27072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        // where we take the user inputs of the 5 subjects - avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the subject " + (i + 1) + ":");
            marks[i] = sc.nextFloat();
        }

        sc.close();
        float avg = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("Avg is -> " + avg);
    }
}




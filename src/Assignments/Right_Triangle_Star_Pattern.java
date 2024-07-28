package Assignments;

import java.util.Scanner;

public class Right_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int rows = 5;  // You can change this value to get a different number of rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

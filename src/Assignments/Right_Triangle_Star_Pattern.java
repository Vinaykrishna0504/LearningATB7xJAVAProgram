package Assignments;

import java.util.Scanner;

public class Right_Triangle_Star_Pattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

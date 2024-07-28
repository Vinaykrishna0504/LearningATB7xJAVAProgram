package Assignments;

public class Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int rows = 5;  // You can change this value to get a different number of rows
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}


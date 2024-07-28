package ex_27072024;

public class Lab150 {
    public static void main(String[] args) {

        int[][] array_2nd = {
                {34, 1},
                {34, 2},
                {34, 3},
        };

        for (int i = 0; i < array_2nd.length; i++) {
            for (int j = 0; j < array_2nd[i].length; j++) {
                System.out.print(array_2nd[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}

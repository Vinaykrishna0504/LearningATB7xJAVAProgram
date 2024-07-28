package ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {

        // Arrays -> new
        int[] marks = new int[3];
        // index -> 0,1,2
        // length -> 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);// if we do not any values, default value will be 0
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        // System.out.println(marks[10]);// Array Index Out of Bound exception, after this nothing will run

        boolean[] is_married = {true, false, true};

        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i + "->" + marks[i]);

        }

        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(i + "->" + weekDays[i]);

        }


    }
}



package ex_27072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        // Find the max salary in the arrays
        // Find the max salary in the salary array
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        // Infosys - Automation - don't use max function
        int max = 1;
        int min = salaries[0];;
        for (int i = 0; i < salaries.length; i++) {
            if(salaries[i] > max){
                max = salaries[i];
            }
            if(min > salaries[i]){
                min = salaries[i];
            }





            // Sort -> find the last one
            //Arrays.sort(salaries);
            // System.out.println(salaries[salaries.length-1]);


        }
        System.out.println(max);
        System.out.println(min);
    }
}

package Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dummy {
        public static void main(String[] args) {
            int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

            int max = 1;
            int min = salaries[0];;
            for (int i = 0; i < salaries.length; i++) {
                if(salaries[i] > max){
                    max = salaries[i];
                }
                if(min > salaries[i]){
                    min = salaries[i];
                }

                System.out.println("Maximum Salary : " + max);
                System.out.println("Second Maximum Salary : " + min);
            }
        }
}


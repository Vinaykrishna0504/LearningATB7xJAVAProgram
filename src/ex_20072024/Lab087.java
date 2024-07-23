package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check if number is even or odd.

        // Logic building
        // 1. Figure out inputs
        // How to take input in Java? - Scanner class can be used
        //nextInt()-> input
        // 2. Which datatype we need to use
        // 3. Do we need conversion or directly we can use.
        // 4. Write rough logic.
        // 5. Optimize.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int user_input = sc.nextInt(); // if we want 2 inputs, but only 1st one works
        System.out.println(user_input);


        if(user_input%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

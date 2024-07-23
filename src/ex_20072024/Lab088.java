package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Max in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1 = sc.nextInt();

        System.out.println("Enter the number 2");
        int number2 = sc.nextInt();

        //System.out.println(Math.max(number1,number2));

        //if(number1 > number2){
           // System.out.println(number1);
        //}else {
          //  System.out.println(number2);
        //}

        if(number1 > number2){
            System.out.println(number1);
        } else if (number2 > number1){
            System.out.println(number2);
        }else{
            System.out.println("Equals");
        }



    }
}

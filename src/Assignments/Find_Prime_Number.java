package Assignments;

import java.util.Scanner;

public class Find_Prime_Number {
    public static void main(String[] args) {
        int number,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        number = sc.nextInt();

        if(number==1){
            System.out.println("Smallest prime number is 2");
        }
        for(i=2;i<number;i++){
            if(number%i==0) {
                System.out.println("Not prime");
                break;
            }
        }
        if(number==i){
            System.out.println("Prime");
        }

    }
}

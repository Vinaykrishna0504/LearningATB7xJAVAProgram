package ex_20072024;

import java.text.BreakIterator;
import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // Take a user input as char and tell the user if it is a vowel or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Char, I will tell you, if it is vowel or not!");
        char user_input = sc.next().charAt(0);

        switch (user_input){
            case 'a':
                System.out.println("It is a vowel");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel, it is Consonant");
                break;
        }
    }
}

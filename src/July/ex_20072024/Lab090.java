package July.ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        // Grade calculator
        // write a program that calculates and displays
        // the letter grade for a given numerical
        // score (e.g., A, B, C, D, E or F)
        // based on the following grading scale:
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // E: 0-59

        // 1. Find the user inputs
        // Score - Datatype? - Int
        // Return - Grade - Datatype? - Char
        // Scanner class for user inputs

        // 2. Basic Logic
        // if ( score >=90 && score <= 100) -> return or print grade A
        // if ( score >=80 && score <= 89) -> return or print grade B
        // if ( score >=70 && score <= 79) -> return or print grade C
        // if ( score >=60 && score <= 69) -> return or print grade D
        // if ( score >=0 && score <= 59) -> return or print grade E

        // 3. Write the code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Student Score!!");
        int Score = sc.nextInt();

        char grade = 'F';

        if(Score >= 90 && Score <= 100){
            grade = 'A';
        }
        else if(Score >= 80 && Score <= 89){
            grade = 'B';
        }
        else if(Score >= 70 && Score <= 79){
            grade = 'C';
        }
        else if(Score >= 60 && Score <= 69){
            grade = 'D';
        } else if (Score < 0 || Score > 100){
            System.out.println("LOL!!, Are you God?");
            grade = 'O';
        }else{
            grade = 'F';
        }
        System.out.println("Your grade is -> " + grade);

        sc.close();
    }
}

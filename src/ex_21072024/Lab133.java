package ex_21072024;

public class Lab133 {
    // Fizzbuzz program
    public static void main(String[] args) {
        for(int i=1; i<=100; i++ ){
            if (i%3 == 0 && i%5 ==0) { // whenever there are more conditions, it should at 1st
                System.out.println("Fizzbuzz");
            }else if (i%3 == 0) {
                System.out.println("Fizz");
            }else if (i%5 == 0) {
                    System.out.println("Buzz");
                    }else{
                            System.out.println(i);
                        }
                    }
                }
            }

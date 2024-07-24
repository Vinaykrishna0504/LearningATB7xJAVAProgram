package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
         // if we use arrow, then no break condition is required
        int itemcode = 014;

        switch (itemcode){
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a desktop");
            case 003, 004 -> System.out.println("It is a Mobile Phone");
            default -> System.out.println("Hello!");
        }
    }
}

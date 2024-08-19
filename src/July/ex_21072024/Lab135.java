package July.ex_21072024;

public class Lab135 {
    public static void main(String[] args) {
        // Function - Block of code which we can reuse.
        // 1. Pre-built - Math.max(), min(),
        // 2. User defined

        // Two components of the functions
        // 1. Define
        // 2. Call the function


        // 2. Call the function
        for (int i = 0; i < 5; i++) {
            greet();
        }

        greet2();
    }


        // 1. Define
        static void greet () {
            System.out.println("Hello, How are you?");

        }
        static void greet2 () {
            System.out.println("Greet2");
        }

}



package August.ex_17082024;

public class Lab209 {
    public static void main(String[] args) {
        String ip = args[0];
        // In edit, enter 100 and that will be passed in place of 0
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(a);
        System.out.println(b);

        // JVM will be initialized
        // Creates and starts the main thread. - Main called
        // 1) Collects the command line arguments
        // 2) Creates the String array with CLI
        // 3) Lab209.main(0);
        // Now the control will be transferred to main method
        // When problem comes in main -> JVM
        // if don't handle the exception JVM -
        // Exception a = new Exception() and terminate the program.
    }
}

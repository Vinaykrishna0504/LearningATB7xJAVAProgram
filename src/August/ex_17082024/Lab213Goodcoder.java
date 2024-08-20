package August.ex_17082024;

public class Lab213Goodcoder {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            String ip = args[0];
            a = Integer.parseInt(ip);
            b = 1000/a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}

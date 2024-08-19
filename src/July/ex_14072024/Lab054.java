package July.ex_14072024;

public class Lab054 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c); // for byte and byte, use int

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1 + b1;
        System.out.println(c1);// here a1&b1 ASCII values will be considered,where a1=65 & b1=66
        System.out.println('A' == 65);
        System.out.println('B' == 69); // B's ASCII values is 66
    }
}

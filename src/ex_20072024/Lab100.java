package ex_20072024;

public class Lab100 {
    public static void main(String[] args) {
        // after a JDK 13, switch can return a value, usually it is not anywhere in testing
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException();
        };
        System.out.println(val);
    }
}

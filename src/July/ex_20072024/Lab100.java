package July.ex_20072024;

public class Lab100 {
    public static void main(String[] args) {
        // after a JDK 13, switch can return a value, usually it is not anywhere in testing
        char code = 'C';
        int val = switch (code){
            case 'A':
                yield 65; // it is similar to return, but we can not use return in place of yield
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}

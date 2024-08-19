package July.ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Vinay Krishna";
        // String ? - Bunch of chars - Collection of chars
        // class - ?
        String name2 = new String("Vinay Krishna");
        // How many ways, we can write a string - 2 ways
        // =, New operator
        // = 'SCP' -> String Constant pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
    }
}

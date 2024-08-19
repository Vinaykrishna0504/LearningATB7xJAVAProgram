package July.ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        // escape characters
        char c = '\n'; //New line or Next Line
        char c1 = '\t';  // Add Tab\
        char c2 = '\b';  // backlash delete 1 char
        char c3 = '\r';  // backlash delete 1 word
        System.out.println("Vinay" + c3 + "Krishna");
        System.out.println("Vinay" + c + "Krishna");
        System.out.println("Vinay" + c1 + "Krishna");
        System.out.println("Vinay" + c2 + "Krishna");
    }
}

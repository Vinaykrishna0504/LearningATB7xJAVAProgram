package ex_27072024;

public class Lab151 {
    public static void main(String[] args) {
        // String - Bunch of chars or collection of chars

        String s1 = new String("Vinay"); //Heap Area
        String s2 = "Vinay"; // SCP

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("V"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}

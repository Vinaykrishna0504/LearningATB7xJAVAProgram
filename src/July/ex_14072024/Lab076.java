package July.ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Vinay";
        //String s1 = "V i n a y";
        //            /0/1/2/3/4/ This is how the bunch of chars are stored as indexes

        char c  = s1.charAt(4);
        System.out.println(c);
        s1 = s1.concat(" Krishna");
        System.out.println(s1);
    }
}

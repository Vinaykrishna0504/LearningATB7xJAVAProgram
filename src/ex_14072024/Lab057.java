package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; not valid
        short s = (short) phone_no;
        System.out.println(s);
    }
}

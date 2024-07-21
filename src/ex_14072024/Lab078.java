package ex_14072024;

import java.util.Locale;

public class Lab078 {
    public static void main(String[] args) {
        String Password = "Vinay@123";
        String pass_u = Password.toLowerCase();
        System.out.println(pass_u == Password);
        System.out.println(pass_u.equals(Password));
        System.out.println(pass_u.equalsIgnoreCase(Password));

        System.out.println(Password.substring(0,3));
        System.out.println(Password.indexOf('i'));
        System.out.println(Password.length());
    }
}

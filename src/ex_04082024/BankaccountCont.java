package ex_04082024;

import java.util.Scanner;

public class BankaccountCont {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the bank");
        String bName = sc.next();
        System.out.println("Enter your Balance");
        int bal = sc.nextInt();
        System.out.println("Enter your bank code");
        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);

        baicici.printDetails();

        sc.close();
        

    }
}

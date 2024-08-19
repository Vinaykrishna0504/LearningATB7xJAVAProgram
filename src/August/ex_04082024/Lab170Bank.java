package August.ex_04082024;

public class Lab170Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();

        /*System.out.println(ba1.bankName);
       System.out.println(ba1.balance);
        System.out.println(ba1.bankCode);*/

        BankAccount baicici = new BankAccount("ICICI", 100, "ICICI001");
        /*System.out.println(baicici.bankName);
        System.out.println(baicici.balance);
        System.out.println(baicici.bankCode);*/

        ba1.printDetails();
        baicici.printDetails();


    }
}

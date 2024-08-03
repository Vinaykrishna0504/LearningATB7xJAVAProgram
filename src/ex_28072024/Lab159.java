package ex_28072024;

public class Lab159 {
    public static void main(String[] args) {
        Bank Bank1 = new Bank();
        Bank Bank2 = new Bank();

        Bank1.name = "SBI";
        Bank2.name = "ICICI";

        System.out.println(Bank1.name);
        System.out.println(Bank2.name);
        System.out.println(Bank1.balance);

        Bank2.balance = 100;
        System.out.println(Bank2.balance);

    }
}

package ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    //DC
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    //PC
    BankAccount(String bName, int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }


    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bank Balance -> " + balance);
    }
}

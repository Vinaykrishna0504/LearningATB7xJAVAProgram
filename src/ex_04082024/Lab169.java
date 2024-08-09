package ex_04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Pramod");
        ATBPerson p2 = new ATBPerson("Amit");
        ATBPerson p3 = new ATBPerson("Praveen", 9876543210L);

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.phone);
    }
}

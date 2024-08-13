package ex_10082024.encapsulation;

public class Lab180 {
    public static void main(String[] args) {


        ICICIBank Vinay = new ICICIBank("Vinay", 100);
        // Set the balance
        // Only admin is accessible

        Vinay.setBal(1000,false);
        System.out.println(Vinay.getName());
        System.out.println(Vinay.getBal());

        ICICIBank Admin = new ICICIBank("Admin", 1000);
        Admin.setBal(50000, true);
        System.out.println(Admin.getName());
        System.out.println(Admin.getBal());


    }
}

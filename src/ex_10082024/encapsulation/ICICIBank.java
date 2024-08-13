package ex_10082024.encapsulation;

public class ICICIBank {

    private String name;
    private long Bal;

    public ICICIBank(String name, long Bal) {
        this.name = name;
        this.Bal = Bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name , boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed");
        }
    }

    public long getBal() {
        return Bal;
    }

    public void setBal(long Bal, boolean isAdmin) {
        if (isAdmin) {
            this.Bal = Bal;
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed");
        }
    }
}

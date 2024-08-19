package August.ex_11082024.StaticKeyword;

public class Lab193 {
    // Static
    // Can be Data member
    // Block
    // Function
    // Class


public static void main(String[] args) {
    System.out.println(ATB.courseName);
    //ATB a1 = new ATB("Vinay");
    //System.out.println(a1.getName());

    //ATB a2 = new ATB("Krishna");
    //System.out.println(a2.getName());

}

class ATB {
    private String Name;
    static String courseName = "ATB";

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public ATB(String Name) {
        this.Name = Name;
    }

}

}

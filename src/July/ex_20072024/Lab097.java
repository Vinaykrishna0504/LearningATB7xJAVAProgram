package July.ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        // multi condition in a single statement will be supported after JDK 13

        int itemcode = 005;
        switch (itemcode){
            case 001, 002, 003:
                System.out.println("It is a electronic gadget");
                break;
            case 004, 005, 006:
                    System.out.println("It is a Mechanical gadget");
                    break;
            default:
                System.out.println("None");
        }
    }
}

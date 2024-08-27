package August.ex_18082024;

public class Lab218 {
    public static void main(String[] args) {
        extracted1();
    }

    private static void extracted1() {
        Integer[] i = new Integer[2];
        System.out.println(i[3]); // Unchecked - ArrayIndexOutOfBoundsException
    }
}

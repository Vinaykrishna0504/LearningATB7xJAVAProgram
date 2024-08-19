package July.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP,
        //only 1 string will be created as name and name1 are almost identical

        String name2 = new String("The Testing Academy");// Heap area
        String name3 = new String("The Testing Academy"); // Heap area
        // in heap area, everything will be created as new string

        System.out.println(name == name1); // Check for ref
        System.out.println(name.equals(name1)); // Check for content

        System.out.println(name == name2); // Check for ref
        // The answer will be false, because name is present in SCP and name2 is present in heap
        System.out.println(name.equals(name2)); // Check for content
        // The answer will be true, as the content is same
    }
}

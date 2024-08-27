package August.ex_18082024;

public class Lab225 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            if (s1 == null){
                throw new Exception("Add a proper string or not null string");
            }
            s1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

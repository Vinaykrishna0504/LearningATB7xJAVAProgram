package August.ex_17082024;

public class Lab215Finally {
    public static void main(String[] args) {
        final double pi  = 3.14;
        int a = 10;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will execute anyhow!!");
        }
    }
}

package ex_11082024.RealLifeExample;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c1 = new Chrome();
        String s = c1.openBrowser("Chrome");
        System.out.println(s);
        c1.closeBrowser("Chrome");
        c1.takeScreenShot();

        System.out.println("------");

        FireFox f1 = new FireFox();
        f1.openBrowser("Firefox");
        f1.closeBrowser("Firefox");
        f1.takeScreenShot();
    }
}

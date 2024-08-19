package August.AccessModifiers.Criminal;

import August.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(100);
        System.out.println(c.gun);
        c.canIShoot();

    }
}

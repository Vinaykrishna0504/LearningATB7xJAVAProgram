package AccessModifiers.Criminal;

import AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(100);
        System.out.println(c.gun);
        c.canIShoot();

    }
}

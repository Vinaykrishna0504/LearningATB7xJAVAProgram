package MultilevelInheritance;

public class Lab174 {
    public static void main(String[] args) {
        // Multilevel
        // GF -> F -> Child
        Child c1 = new Child();
        c1.home();// If name is same, then priority C -> F -> GF

        c1.C();
        c1.gf();
        c1.f();
    }

}

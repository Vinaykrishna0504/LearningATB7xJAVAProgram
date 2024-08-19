package August.ex_17082024;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        a.age = 12;
        System.out.println(A.discount);
        a.m2();
        A.m1();// Static

        // Static doesn't need a object reference
    }
}

class A{
    int age = 10; // Instance variable
    static int discount = 199; // Static variable
    // SIB - Static initialization block
    static {
        System.out.println("One time load SIB");
    }
    // IIB - Instance initialization block
    {
        System.out.println("IIB when new object is created");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}

package August.ex_17082024;

public class Lab201 {
}

// Nested Class - Rarely used

class outerclass{
    Integer a = 10;

    void outerclass_m1(){
        System.out.println("outerclass_m1");
    }

    class innerclass{
        Integer b = 20;
        void inner_m2(){
            System.out.println(a);
        }
    }
}

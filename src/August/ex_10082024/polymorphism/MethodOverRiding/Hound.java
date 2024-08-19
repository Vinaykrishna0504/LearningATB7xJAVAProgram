package August.ex_10082024.polymorphism.MethodOverRiding;

public class Hound extends Dog{

    @Override
    void bark(){
        System.out.println("I am Hound, I will bark!!");
    }

    void bike(){
        System.out.println("Biked");
    }
}


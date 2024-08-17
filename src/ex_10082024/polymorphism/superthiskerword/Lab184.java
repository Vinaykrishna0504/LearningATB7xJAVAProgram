package ex_10082024.polymorphism.superthiskerword;

public class Lab184 {
}

class Student extends Person{
    // Is A relation - Inheritance
    @Override
    void message(){
        System.out.println("I am Student message");
    }

    void display() {
        super.message();
    }
}

class Person{
    void message(){
        System.out.println("I am person message");
    }
}

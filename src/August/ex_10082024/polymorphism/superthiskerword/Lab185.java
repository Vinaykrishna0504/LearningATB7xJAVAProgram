package August.ex_10082024.polymorphism.superthiskerword;

public class Lab185 {
    // super.variable
    // super.method()
    // super() -> DC
    // super("Pramod) -> PC
    // this()
    // super()


}

class Person1{
    Person1(){
        System.out.println("Person1 -  DC");
    }

    Person1(String a){
        System.out.println("Person1 - PC A1");
    }

    Person1(String a, int a1){
        System.out.println("Person - PC A2");
    }
}

class Student1 extends Person1{
    Student1(String s){
        System.out.println("PC - Student");
    }

    Student1(){
        //this("Vinay");
        //super();
        //super("Vinay");
        //super("Vinay", 21);
    }

}
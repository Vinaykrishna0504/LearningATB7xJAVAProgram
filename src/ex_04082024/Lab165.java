package ex_04082024;

public class Lab165 {


    int age = 45; //Instance variable

    void f1(){
        int e = 10; // e can't be used in f2, because it's local variable
        System.out.println(age);
    }

    void f2(){
        System.out.println(age);
    }
}

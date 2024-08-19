package August.ex_11082024.Ex_Interface;

public class Lab191 {
    public static void main(String[] args) {
       // I i = new I();
    }
}

interface I{}
class A{}
class B{}
abstract class c{} // Its incomplete class
class Test1 extends A{} // It is okay
class Test2 extends B{}
// class Test3 extends A,B{}// Its not okay, because of multiple inheritance
class Test0 implements I{}
interface I1{}
interface I2{}
class Test4 implements I1,I2{} // It is possible, multiple inheritance with interface is possible
class Test5 extends A implements I1,I2{} // It is possible
//class Test6 implements I1 extends A{} // Not Possible
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}
//interface I7 extends C{}

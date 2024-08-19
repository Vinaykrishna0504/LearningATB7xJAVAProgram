package August.ex_11082024.Ex_Interface.Example3;

public class Lab192 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

interface Eng{
    void start();
    default void m1(){
        System.out.println("Old M1");
    }

    default void Suite(){
        System.out.println("Wear suite");
    }
}

interface GearBox extends Eng{
    void gear();
}

interface Keys extends GearBox{
    void opencar();
}

class Car implements Keys{
    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void gear() {

    }

    @Override
    public void opencar() {

    }
}
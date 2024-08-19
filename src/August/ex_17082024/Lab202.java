package August.ex_17082024;

public class Lab202 {
    public static void main(String[] args) {
        Car c = new Car("Lamborghini");
        c.drive();
        System.out.println(c.make);

        // To access the inner class object creation
        Car.Gearbox cg = c.new Gearbox();
        cg.m2();
    }
}

class Car{
    String make;


    public Car(String make){
        this.make = make;
    }

    //method
    void drive(){
        System.out.println("You can drive car");
    }

    class Gearbox{
        void m2(){
            System.out.println("m2");
        }
        class NutBolts{

        }
    }
}

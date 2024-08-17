package ex_11082024.Example_Car;

public class WagonR extends Engine{

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    void start() {
        System.out.println("Starting WagonR");
    }

    @Override
    void stop() {
        System.out.println("Stop WagonR");
    }

    @Override
    void speed() {
        System.out.println("100km/hr");
    }

    @Override
    void partGearBox() {
        System.out.println("WagonR Gear box");
    }

    @Override
    void openCar() {
        System.out.println("Open the car");
    }

    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();

    }
}

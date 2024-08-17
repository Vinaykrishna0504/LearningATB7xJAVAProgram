package ex_11082024.Example_Car;

public class Tesla extends Engine{
    void Drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stop Tesla");
    }

    @Override
    void speed() {
        System.out.println("200km/hr");
    }

    @Override
    void partGearBox() {
        System.out.println("Tesla Gear box");
    }

    @Override
    void openCar() {
        System.out.println("Open the car");
    }
}

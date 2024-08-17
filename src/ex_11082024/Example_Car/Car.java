package ex_11082024.Example_Car;

abstract class Car extends Engine {
    // Car will Engine, GearBox, Keys

    // Tesla is type of car
    // Tesla - DRIVE()

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    void openCar() {
        System.out.println("Open Car with keys");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of GearBox");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

    @Override
    void start() {
        System.out.println("Start a Car");
    }

    @Override
    void speed(){
        System.out.println("Car");
    }
}

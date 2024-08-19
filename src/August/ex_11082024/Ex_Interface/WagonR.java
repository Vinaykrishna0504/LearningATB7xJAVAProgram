package August.ex_11082024.Ex_Interface;

public class WagonR implements Engine{

    void drive(){
        StartEngine();
        StopEngine();
    }

    @Override
    public void StartEngine() {
        System.out.println("WagonR is starting");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stopping of WagonR");
    }
}

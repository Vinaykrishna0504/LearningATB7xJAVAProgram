package ex_10082024.polymorphism.superthiskerword;

public class Java183 {
    // Super
    // 1. Super can be used with variables
    // 2. Super can be used with Methods
    // 3. Super can be used with Constructors

    // Super keyword in java is a reference variable that allows
    // a subclass - child class
    // to refer its parent class.
    public static void main(String[] args) {
        car s = new car();
        s.display();

    }


}

class car extends vehicle{
    private int maxSpeed = 280;

    void display(){
        System.out.println("Car Speed is -> "+ this.maxSpeed);
        System.out.println("Vehicle Speed is -> "+ super.maxSpeed);
    }

}


class vehicle{
    public int maxSpeed = 180;

    //public int getmaxSpeed() {
      //  return maxSpeed;
    //}

    //public void setmaxSpeed(int maxSpeed) {
      //  this.maxSpeed = maxSpeed;
    //}

    void message(){
        System.out.println("Hello Vehicle");
    }
}


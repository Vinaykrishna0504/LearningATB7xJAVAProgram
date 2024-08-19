package August.ex_10082024.polymorphism.MethodOverRiding;

public class Lab182 {
    //Method Overriding / Runtime poly
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
        h1.bike();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_ref = new Hound();
        dog_ref.bark(); // Can access only overriden functions
        //dog_ref.bike();
    }
}

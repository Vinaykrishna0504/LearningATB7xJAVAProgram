package August.ex_10082024.polymorphism.MethodOverloading;

public class MathOperations {

    // Encapsulation
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method Overloading

    int add (int vinay, int krishna , int krish){
        return vinay + krishna;
    }


    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }

    String add(String a, int b){
        return a + b;
    }

    MathOperations(){}
    MathOperations(int a){}
    MathOperations(int a, int b){}
    MathOperations(int a, int b, int c){}
    MathOperations(int a, int b, int c, int d){}

}

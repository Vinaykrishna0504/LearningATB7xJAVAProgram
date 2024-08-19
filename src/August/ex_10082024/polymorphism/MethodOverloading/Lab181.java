package August.ex_10082024.polymorphism.MethodOverloading;

public class Lab181 {
    //Polymorphism

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2, 3);
        double result2 = mathOperations.add(2.4, 3.6);
        String result3 = mathOperations.add("Vinay ", "Krishna");
        String result4 = mathOperations.add("Vinay ", 123);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

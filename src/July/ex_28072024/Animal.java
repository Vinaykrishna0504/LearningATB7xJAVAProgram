package July.ex_28072024;

public class Animal {
    String name = "LOL";
    String colour;

    void walk(){}
    void talk(){}

    public static void main(String[] args) {
         Animal animalRef = null;
         Animal animalRef2 = new Animal();
         Animal animalRef3 = new Animal();
         Animal animalRef4 = animalRef2;
        System.out.println(animalRef4.name);
    }
}

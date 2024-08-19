package August.ex_11082024.Ex_Interface.MultipleInheritance;

public class Son implements Mother,Father{


    @Override
    public void home() {

    }

    @Override
    public void money() {
        System.out.println("This is only one function");

    }
}

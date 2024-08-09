package ex_04082024;

public class ATBPerson {

    String name;
    long phone;

    //DC

    ATBPerson() {
        System.out.println("Object is created!");
    }

    ATBPerson(String nameGiven){
        this.name = nameGiven;
    } // this -> Current class

    ATBPerson(String nameGiven, Long phoneNumber){
        this.name = nameGiven;
        this.phone = phoneNumber;
    }


}

package ex_21072024;

public class Lab112 {
    public static void main(String[] args) {
        final boolean b1 = true;
        //b1 = false; we can't provide as; final is fixed now
        //for (int i = 0; b1 ; i++) {
        //System.out.println("Hello"); // it will run infinite times as b1 is provided as condition
        //for (int j = 0;;) {
        //  System.out.println("Hello");// it will keep on printing, because no exit point

        //for (;;) {
          //  System.out.println("Hello");// It will be keep on printing, because no exit point and no condition
        //}

        /*for(float f=0; f<10.67; f++){
            System.out.println("Hi, float -> " + f);
        }*/

        for(byte f=0; f<10.67; f++){
            System.out.println("Hi, float -> " + f);
        }


    }
}

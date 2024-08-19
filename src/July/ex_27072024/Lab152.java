package July.ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        // Strings - Immutable in nature
        // StringBuilder, StringBuffer
        String s1 = "Vinay";
        s1 = "Krishna";

        StringBuffer stringBuffer = new StringBuffer("Vinay");
        // Change the value of string - Buffer
        stringBuffer.append("Krishna"); //VinayKrishna

        StringBuilder stringBuilder = new StringBuilder("Amith");
        stringBuilder.append("Krishna");

        // StringBuilder and StringBuffer will solve our memory wastage problem

        // Thread Safety ?
        // StringBuilder - not thread safe - People love it
    }
}

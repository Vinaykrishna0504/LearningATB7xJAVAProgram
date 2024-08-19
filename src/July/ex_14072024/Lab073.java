package July.ex_14072024;

public class Lab073 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " Guys";
        String str3 = "Hello Guys";
        String str4 = str1.concat(str2);
        // 4 strings will be created, even though str4 and str3 looks, as it is concatinated, it will be considered as new one.
    }
}

package August.ex_17082024.CollectionFramework;

public enum Color {
    RED("ff0000"),
    GREEN("fd0d0d"),
    BLUE("fd0d0d");


    private String hexValue;
    Color(String hexValue){
        this.hexValue = hexValue;
    }

    public String getValue(){
        return hexValue;
    }
}

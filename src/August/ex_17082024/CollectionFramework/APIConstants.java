package August.ex_17082024.CollectionFramework;

public enum APIConstants {
    BASE_URL("https://app.vwo.com"),
    Login_Page("https://app.vwo.com/Login"),
    Dashboard_Page("https://app.vwo.com/Dashboard"),
    Chatbot_Page("https://app.vwo.com/Chat");


    private final String name;
    APIConstants(String name){
        this.name = name;
    }

    public String getValue(){
        return name;

    }
}

package August.ex_10082024.polymorphism.superthiskerword;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); // Dynamic dispatch // Runtime
        //t1.setBrowser("Opera",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}

class  TestCase1 extends BaseClass{
    //TestCase is a type of BaseClass - Single inheritance
    TestCase1(){
        super();//DC of parent
        this.setBrowser("edge", true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth){
        super.setBrowser(browser, isAuth);
    }
}

class BaseClass{
    BaseClass(){
        System.out.println("DC - baseClass");
    }
    BaseClass(String b){
        System.out.println("PC - baseClass");
    }
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser(){
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}
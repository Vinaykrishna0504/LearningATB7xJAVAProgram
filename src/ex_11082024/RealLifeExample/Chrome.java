package ex_11082024.RealLifeExample;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Opening the Chrome....");
        return "Browser is opened";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Chrome....");
        // This is the code related to the chrome browser only
        return "Browser is closed";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Okay taking Screenshot of Chrome");
    }
}

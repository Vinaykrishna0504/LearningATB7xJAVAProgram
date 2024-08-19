package August.ex_11082024.RealLifeExample;

abstract class BaseClass extends GrandBaseClass {
    // Web Automation
    // Single inheritance
    // Hide the functionalities of the opening and closing browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);

    @Override
    void takeScreenShot() {
        System.out.println("Okay taking Screenshot");
    }
}

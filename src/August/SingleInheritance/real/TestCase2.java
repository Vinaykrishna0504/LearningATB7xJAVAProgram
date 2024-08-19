package August.SingleInheritance.real;

public class TestCase2 extends BaseTest {

    void testCase2(){
        startBrowser(); // BaseTest
        getDatafromSQL(); //GrandBaseTest
        System.out.println(gold); //GrandBaseTest
        closeBrowser(); //BaseTest
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}

package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        // Web automation
        // I will ask user which browser you want me to run the code,
        // Chrome -> Start chrome, firefox -> Start firefox, Edge -> Start Edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser, where you want to execute the program");
        String browserName = sc.next();

        switch (browserName){
            case "Chrome":
                System.out.println("Starting the chrome browser");
                // further code to start the chrome
                // webdriver driver = new chrome();// selenium code
                break;
            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "Edge":
                System.out.println("Starting the Edge browser");
                break;
            default:
                System.out.println("I have no idea, which browser is this");
                break;
        }
    }
}

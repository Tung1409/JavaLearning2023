package main.java.lession_12;

public class IOSDriver extends AppiumDriver{

    @Override
    protected void initDriver() {
        System.out.println("init IOSDriver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Close IOSDriver");
    }
}

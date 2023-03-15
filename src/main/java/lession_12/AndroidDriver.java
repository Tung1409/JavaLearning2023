package main.java.lession_12;

public class AndroidDriver extends AppiumDriver{

    @Override
    protected void initDriver() {
        System.out.println("init AndroidDriver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Close AndroidDriver");
    }
}

package main.java.lession_12;

import lession_11_1.Platform;

public class LaunchAppTest {

    public static void main(String[] args) {
        AppiumDriver appiumDriver = DriverFactory.getAppiumDriver(Platform.IOS);

        appiumDriver.initDriver();
        appiumDriver.closeDriver();
    }
}

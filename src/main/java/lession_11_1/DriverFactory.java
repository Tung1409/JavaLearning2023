package main.java.lession_11_1;

public class DriverFactory {

    public static void initAppiumDriver(Platform platform) {
        switch (platform) {
            case IOS:
                System.out.println("init IOS Driver");
                break;
            case ANDROID:
                System.out.println("init ANDROID Driver");
                break;
            default:
                throw new IllegalArgumentException("Please provide correct platform");
        }
    }
}

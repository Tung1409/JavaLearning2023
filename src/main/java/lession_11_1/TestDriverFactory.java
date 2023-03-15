package main.java.lession_11_1;

public class TestDriverFactory {

    public static void main(String[] args) {
//        boolean isRunningOnIOS = System.getenv("platform").equals("ios");
//        if (isRunningOnIOS) {
//            DriverFactory.initAppiumDriver(Platform.ANDROID);
//        } else {
//            DriverFactory.initAppiumDriver(Platform.IOS);
//        }
//    }

        System.out.println(SupportIOSVersion.IOS_13.getIosName());
        System.out.println(SupportIOSVersion.IOS_13.getIosVersion());

    }
}
// enum giong nhu bien tham chieu
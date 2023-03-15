package main.java.lession_11_1;

public enum SupportIOSVersion {

    IOS_13("IOS 13", 13),
    IOS_15("IOS 15", 15);

    private String iosName;
    private int iosVersion;

    SupportIOSVersion(String iosName, int version){
        this.iosName = iosName;
        this.iosVersion = version;
    }

    public String getIosName() {
        return iosName;
    }

    public int getIosVersion() {
        return iosVersion;
    }
}

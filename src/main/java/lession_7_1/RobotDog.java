package main.java.lession_7_1;

public class RobotDog {

    protected static int dogId = 0;
    private int robotId;

    public RobotDog() {
        robotId = dogId + 1;
        dogId++;
    }

    public int getDogId() {
        return robotId;
    }

    public static void changeID() {
        dogId++;
//    }
        //static la share value, 1 thang thay doi thi tat ca deu thay doi
        // static xuat hien truoc object (public RobotDog())
        // cho nen static khong the goi object, chi co object moi goi duoc static
    }
}
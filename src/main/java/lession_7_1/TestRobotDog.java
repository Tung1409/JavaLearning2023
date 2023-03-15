package main.java.lession_7_1;

public class TestRobotDog {

    public static void main(String[] args) {
        RobotDog dog = new SolarRobotDog();
        RobotDog.changeID();

        RobotDog dog2 = new WindRobotDog();

        System.out.println(dog.getDogId());
        System.out.println(dog2.getDogId());
        //static la share value, 1 thang thay doi thi tat ca deu bi thay doi

    }
}

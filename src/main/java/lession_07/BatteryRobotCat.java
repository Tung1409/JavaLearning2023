package main.java.lession_07;

// Sub-class, child class, concrete class
public class BatteryRobotCat extends RobotCat{
    // neu thang cha khong co default constructor thi thang con phai goi it nhat 1 constructor cua thang cha



    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    @Override
    public String charge(){
        return super.charge() + "with battery";

    }
}

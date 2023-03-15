package main.java.lession_07;

// Sub-class, child class, concrete class
public class SolarRobotCat extends RobotCat{
    // neu thang cha khong co default constructor thi thang con phai goi it nhat 1 constructor cua thang cha



    public SolarRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    @Override
    public String charge()  {
        return super.charge() + "with solar energy";
    }


    //Override se di tu thang nho len tren (nho? len thang ong noi)
}

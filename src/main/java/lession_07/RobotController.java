package main.java.lession_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    //test controller
    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat batteryRobotCat = new BatteryRobotCat("BatteryRobotCat", "2/2/2022");
        RobotCat solarRobotCat = new SolarRobotCat("SolarRobotCat", "3/3/2023");
        robotController.charge(Arrays.asList(batteryRobotCat, solarRobotCat));
    }

    public void charge(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}

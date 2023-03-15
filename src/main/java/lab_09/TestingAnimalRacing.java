package main.java.lab_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingAnimalRacing {

    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        Animal horse = new Horse("Horse");
        Animal tiger = new Tiger("Tiger");

        RacingController racingController = new RacingController();
        racingController.getWinner(Arrays.asList(dog, horse, tiger));

    }
}
